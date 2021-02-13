package org.yu.java8.streamapi;

import org.yu.java8.lambda.methodref.EmployeeData;
import org.yu.java8.lambda.methodref.bean.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName cl01.java
 * @Description TODO
 * @createTime 2021年02月13日 15:08:00
 */
public class cl01 {
    //方式1 通过集合创建
    public void m01(){
        List<Employee> employees = EmployeeData.getEmployees();
        //顺序流
        Stream<Employee> stream = employees.stream();
//        2.1筛选与切片
        Stream<Employee> employeeStream1 = stream.filter(s -> s.getId() == 1001);
        employeeStream1.forEach(System.out :: println);
        //并行流
        Stream<Employee> employeeStream = employees.parallelStream();
    }
    public void m01_1(){
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        //用于映射每个元素到对应的结果
        list.stream().map(s -> s.toUpperCase(Locale.ROOT)).forEach(System.out :: println);
        List<Employee> employees = EmployeeData.getEmployees();
        //顺序流
        Stream<Employee> stream = employees.stream();
        //map()
        Stream<String> stringStream = stream.map(Employee::getName);
        stringStream.filter(s -> s.length() > 2).forEach(System.out :: println);
    }
    public void m01_2(){
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Stream stream = list1.stream();
        stream.sorted().forEach(System.out ::println);


        ArrayList<Integer> list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        Stream<Integer> stream2 = list2.stream();
        stream2.sorted((s,s1) -> {
            int i = s.compareTo(s1);
            return -i;
        }).forEach(System.out :: println);
    }
    //方式2 通过数组创建
    public void m02(){
        int[] arr = new int[]{1,2,4,9,5,7};
        IntStream stream = Arrays.stream(arr);

        Employee e1 = new Employee(1001,"tom");
        Employee e2 = new Employee(1002,"jerry");
        Employee[] array2 = new Employee[]{e1,e2};

        Stream<Employee> stream1 = Arrays.stream(array2);

    }
    //方式3 通过Stream的of()
    public void m03(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    //终止操作
    public void m04(){
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
        boolean b = stream.allMatch(s -> s.getAge() > 18);
        System.out.println(b);

        boolean b1 = employees.stream().noneMatch(s -> s.getAge() > 160);
        System.out.println(b1);

        System.out.println(employees.stream().findFirst());

        Optional<Employee> any = employees.parallelStream().findAny();
        System.out.println(any);

        long count = employees.stream().count();
        System.out.println(count);

        Optional<Employee> max = employees.stream().max((s1,s2) -> {
        if (s1.getAge() > s2.getAge())
            return 1;
        return -1;
        });
        System.out.println(max);

        Optional<Employee> min = employees.stream().min((s1,s2) -> {
        if (s1.getAge() > s2.getAge())
            return 1;
        return -1;
        });
        System.out.println(min);
    }
    //reduce 规约
    public void m05(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream = list.stream();
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return Integer.sum(integer,integer2);
            }
        };
        Integer reduce = stream.reduce(0, binaryOperator);

        System.out.println(reduce);

        //第一个参数类似一个初始值
        System.out.println(list.stream().reduce(5, Integer::sum));
    }
    //收集
    public void m06(){
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> collect = employees.stream().collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

}
