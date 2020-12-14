package com.spm.om.aspectjAop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author skyqlc
 * @name com.spm.om.aspectjAop
 * @create 2020/09/13:15:49
 */
public class aspectjTest {
    /*AspactJ框架常用注解
    @PonitCut  // 声明切入点的注解
    @Before	   // 声明前置通知注解
    @After	   	// 声明后置通知注解(原始方法执行正常或者非正常执行都会进入)
    @AfterReturing	// 声明后置通知注解(原始方法必须正常执行)
    @AfterThrowing    // 声明异常通知
    @Around    // 环绕通知注解*/
    public static void main(String[] args) {
        System.out.println("aspect");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Calculator calculator= ctx.getBean (Calculator.class);
         calculator.add(5,3);
         calculator.min(5,2);
    }
}
