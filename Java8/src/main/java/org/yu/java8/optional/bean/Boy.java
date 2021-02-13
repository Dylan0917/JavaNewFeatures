package org.yu.java8.optional.bean;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Boy.java
 * @Description TODO
 * @createTime 2021年02月13日 19:22:00
 */
public class Boy {
    private Girl girl;

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Boy() {
    }

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }
}
