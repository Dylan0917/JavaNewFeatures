package org.yu.java8.lambda.methodref;

import org.yu.java8.lambda.methodref.bean.Employee;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Method01.java
 * @Description TODO
 * @createTime 2021年02月13日 13:35:00
 */
public class MethodRef01 {

    public void m01(){
        Consumer<String> con1 = s -> System.out.println(s);
        con1.accept("北京");
        PrintStream out = System.out;
        Consumer<String> con2 = out::println;
        con2.accept("南京");
    }
    public void m02(){

        Employee employee = new Employee(1001,"tom",23,5600);
        Supplier<String> sup1 = () -> employee.getName();
        System.out.println(sup1.get());

        Employee employee1 = new Employee(1001,"tom1",23,5600);
        Supplier<String> sup2 = employee1::getName;
        System.out.println(sup2.get());
    }
    public void m03(){

        Comparator<Integer> com1 = (t1,t2) -> Integer.compare(t1,t2);
        System.out.println(com1.compare(1, 2));
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(1, 2));

    }
    public void m04(){

        Comparator<String> com1 = (t1,t2) -> t1.compareTo(t2);
        System.out.println(com1.compare("ab", "abd"));
        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abdd", "abd"));
    }
    //构造器引用
    public void m05(){
        //无参数构造器
        Supplier<Employee> sup = () -> new Employee();
        Supplier<Employee> sup1 = Employee::new;
        sup.get();
        sup1.get();

        //一个参数的构造器
        Function<Integer,Employee> function = id -> new Employee(id);
        System.out.println(function.apply(1).toString());
        Function<Integer,Employee> function1 = Employee::new;
        System.out.println(function1.apply(2).toString());
    }
    public void m06(){
        Function<Integer,String[]> function = leng -> new String[leng];
        String[] arr1 = function.apply(6);
        System.out.println(Arrays.asList(arr1));

        Function<Integer,String[]> function1 = String[] :: new;
        String[] arr2 = function1.apply(5);
        System.out.println(Arrays.asList(arr2));

    }
}
