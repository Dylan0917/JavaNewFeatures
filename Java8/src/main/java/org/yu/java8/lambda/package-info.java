/**
 * @ClassName package-info.java
 * @author admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年02月13日 11:53:00
 */
package org.yu.java8.lambda;
/**
 * Lambda 规定接口中只能有一个需要被实现的方法，不是规定接口中只能有一个方法
 *
 *
 * 语法形式为 () -> {}，其中 () 用来描述参数列表（抽象方法的形参列表），
 * {} 用来描述方法体(重写的方法体)，-> 为 lambda运算符
 * 1 无参数 无返回值----Runnable
 * 2 一个参数 无返回值 Consumer<String> consumer02 = (String s) -> System.out.println(s);
 * 3 数据类型可以省略 类型推断 Consumer<String> consumer03 = (s) -> System.out.println(s);
 * 4 如果只有一个参数 可以省略括号 Consumer<String> consumer04 = s -> System.out.println(s);
 * 5 两个以上参数 多条执行语句 有返回值 Comparator<Integer> comparator = ((o1, o2) -> {
 *             System.out.println(o1);
 *             System.out.println(o2);
 *             return o1.compareTo(o2);
 *         });
 *
 * 6 当方法体只有一条语句时，return与大括号若有 都可以省略 Comparator<Integer> comparator1 = ((o1, o2) -> o1.compareTo(o2));
 *
 */
/**
 * 函数式接口
 * @FunctionalInterface
 * public interface MyInterface {
 *     public Integer addNun(int p1,int p2);
 * }
 * 内置接口
 * Consumer接口：java.util.function.Consumer接口中包含抽象方法void accept(T t),表示接受单个输入参数并且不返回结果的操作 (消费者，使用一个指定泛型数据,使用方式可以自己确定)。
 *
 */

/**
 * 方法引用
 * 1 传递给lambda体的操作，已经有实现方法了，可以使用方法引用
 *格式 类（或对象）::方法名
 *具体分为三种情况 对象::非静态方法
 * 类::非静态方法 Comparator<String> com2 = String::compareTo;
 * 类::静态方法  Comparator<Integer> com2 = Integer::compare;
 *要求：接口方法的形参必须和返回值类型必须和现有方法相同
 *数组引用
 * Function<Integer,String[]> function1 = String[] :: new;
 *
 */
