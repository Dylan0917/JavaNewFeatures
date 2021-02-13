package org.yu.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Lambda02.java
 * @Description TODO
 * @createTime 2021年02月13日 13:11:00
 */
public class Lambda02 {


    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
    public List<String> filterString(List<String> list, Predicate<String> predicate){
        ArrayList<String> retList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)){
                retList.add(s);
            }
        }
        return retList;
    }
    public void m01(){
        //Consumer接口：java.util.function.Consumer接口中包含抽象方法void accept(T t),
        // 表示接受单个输入参数并且不返回结果的操作 (消费者，使用一个指定泛型数据,使用方式可以自己确定)。
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println(aDouble);
            }
        });
        happyTime(400,money -> System.out.println(money));
    }
    public void m02(){
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("南京");
        list.add("天津");
        list.add("东京");
        list.add("西京");
        list.add("普京");
        List<String> list1 = filterString(list, s -> {
            if (s.contains("京")) {
                return true;
            }
            return false;
        });
        System.out.println(list1.toString());

        List<String> list2 = filterString(list, s -> s.contains("京"));
        System.out.println(list2.toString());
    }

}
