package com.spm.om.test;

import com.spm.om.vo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author skyqlc
 * @name com.spm.om.test
 * @create 2020/08/15:23:13
 */
public class testMain {
    public static void main(String[] args) {
        /*没有使用spring,需要手动new*/
        /*User user1 = new User();
        user1.setUserName("qiulinchuan");
        user1.setAddress("wuhai");
        user1.setId(1);
        System.out.println("user:" + user1);*/

        /*使用spring */
       /* ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");*/
        /*找spring容器要我初始化的实例*/
        ClassPathXmlApplicationContext ctx = getCtx();
        // User u1 = (User) ctx.getBean("user2");
        /*User u2 = ctx.getBean("user",User.class);*/
        User u2 = (User) ctx.getBean("user2");

        //System.out.println(u1);
        System.out.println(u2);

    }

    private static ClassPathXmlApplicationContext getCtx() {
        System.out.println("我是main 静态方法");
        // ClassPathXmlApplicationContext ctx =
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }



}
