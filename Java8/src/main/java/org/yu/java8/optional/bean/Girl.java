package org.yu.java8.optional.bean;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Girl.java
 * @Description TODO
 * @createTime 2021年02月13日 19:22:00
 */
public class Girl {
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
