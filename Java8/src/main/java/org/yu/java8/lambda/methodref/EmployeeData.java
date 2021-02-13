package org.yu.java8.lambda.methodref;

import org.yu.java8.lambda.methodref.bean.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName EmployeeData.java
 * @Description TODO
 * @createTime 2021年02月13日 13:38:00
 */
public class EmployeeData {
    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001,"马化腾",34,6000.38));
        list.add(new Employee(1002,"马云",12,9876.18));
        list.add(new Employee(1003,"刘强东",32,3000.38));
        list.add(new Employee(1004,"雷军",26,7567.37));
        list.add(new Employee(1005,"李彦宏",65,555.32));
        list.add(new Employee(1006,"比尔盖茨",42,9500.38));
        list.add(new Employee(1007,"任正非",26,4333.32));
        list.add(new Employee(1008,"扎克伯格",35,3500.32));
        return list;
    }
}
