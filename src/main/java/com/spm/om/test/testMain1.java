package com.spm.om.test;

import com.spm.om.vo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skyqlc
 * @name com.spm.om.test
 * @create 2020/08/15:23:36
 */
public class testMain1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*找spring容器要我初始化的实例*/
        User u2 = (User) ctx.getBean("user2");
        User u3 = ctx.getBean("user2", User.class);
        System.out.println(u2);
        System.out.println(u3);

        System.out.println("------------------------");
        u2.setUserName("qiul2");
        u2.setId(2);
        System.out.println(u2);
        System.out.println(u3);

        /* System.out.println();*/



    }


}
