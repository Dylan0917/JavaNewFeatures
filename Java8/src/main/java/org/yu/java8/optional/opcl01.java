package org.yu.java8.optional;

import org.yu.java8.optional.bean.Girl;

import java.util.Optional;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName opcl01.java
 * @Description TODO
 * @createTime 2021年02月13日 17:47:00
 */
public class opcl01 {


    public void m01(){
        Girl girl = new Girl();
//        girl = null; 不能为空
        Optional<Girl> girl1 = Optional.of(girl);

        Girl girl2 = new Girl();
        girl2 = null;
        Optional<Girl> girl21 = Optional.ofNullable(girl2);
    }
    public void m02(){
        Girl girl = new Girl();
//        girl = null;
//        System.out.println(girl.getName());//空指针异常

        //使用Optional
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        Girl girl2 = girl1.orElse(null);
        System.out.println(girl2);


    }

}
