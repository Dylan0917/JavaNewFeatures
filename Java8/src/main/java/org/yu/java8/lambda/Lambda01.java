package org.yu.java8.lambda;

import org.yu.java8.lambda.service.MyInterface;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Lambda01.java
 * @Description TODO
 * @createTime 2021年02月13日 11:36:00
 */
public class Lambda01 {

    public void m01(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("济南--");
            }
        };
        runnable.run();
        Runnable runnable1 = () -> System.out.println("千佛山");
        runnable1.run();
    }
    public void m02(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(com1.compare(1, 2));
        Comparator<Integer> com2 = ((o1, o2) -> Integer.compare(o1,o2));
        System.out.println(com2.compare(122, 34));

        //方法引用
        Comparator<Integer> com3 = Integer::compare;

        System.out.println(com3.compare(66, 55));
    }
    public void m03(){
        Consumer<String> consumer01 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer01.accept("一个参数 无返回值-01");
        Consumer<String> consumer02 = (String s) -> System.out.println(s);
        consumer02.accept("一个参数 无返回值-02");

        //类型推断
        Consumer<String> consumer03 = (s) -> System.out.println(s);
        consumer03.accept("类型推断");

        Consumer<String> consumer04 = s -> System.out.println(s);
        consumer04.accept("只有一个参数，省略括号");
    }
    public void m04(){
        Comparator<Integer> comparator = ((o1, o2) -> {
            return o1.compareTo(o2);
        });
        System.out.println(comparator.compare(12, 22));

        Comparator<Integer> comparator1 = ((o1, o2) -> o1.compareTo(o2));
        System.out.println(comparator1.compare(12, 22));
    }
    public void m05(){
        MyInterface myInterface = ((p1, p2) -> {
            return p1 + p2;
        });
        System.out.println(myInterface.addNun(1, 6));
    }

}
