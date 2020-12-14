package com.spm.om.aspectjAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author skyqlc
 * @name com.spm.om.aspectjAop
 * @create 2020/09/13:15:59
 */
@Component
@Aspect  /*表示这是一个切面*/
public class LogAspect {
    /*前置通知：在目标方法执行前执行*/
    @Before("@annotation(Action)")
    public void before (JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 方法开始执行了");
    }

    /*后置通知：在目标方法执行后执行*/
    @After("@annotation(Action)")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " 方法结束执行了");
    }

    /*返回通知：返回目标方法值*/
    @AfterReturning(value = "@annotation(Action)",returning = "r")
    public void returning(JoinPoint joinPoint,Integer r){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+ " 返回通知: " + r);
    }


    /*异常通知:当目标方法抛出异常时，该方法会被 触发
    * e 异常参数，和方法参数名一一对应，注意异常的类型
    * */
    @AfterThrowing(value = "@annotation(Action)",throwing = "e")
    public void afterThrowing (JoinPoint joinPoint , Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+ " 异常通知: " + e.getMessage());
    }

    /*环绕通知
    * 是上面四种通知的集大成者
    * */
    @Around("@annotation(Action)")
    public Object around (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String name =proceedingJoinPoint.getSignature().getName();
        /*这个有点类似于method.invoke方法
        * 我们可以在这个方法前后添加日志，相当于前置/后置
        * */
        Object proceed = proceedingJoinPoint.proceed();
        // Object proceed = proceedingJoinPoint.proceed(new Object[]{4,3});
        return proceed;
    };

}
