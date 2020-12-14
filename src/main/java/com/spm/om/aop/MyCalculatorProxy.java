package com.spm.om.aop;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @author skyqlc
 * @name com.spm.om.aop
 * @create 2020/09/13:14:00
 */
public class MyCalculatorProxy {
    public static Object getInastance(MyCalculatorImpl myCalculator){
        return Proxy.newProxyInstance(MyCalculatorProxy.class.getClassLoader(),
                myCalculator.getClass().getInterfaces(),
                new InvocationHandler() {
            /*
            *proxy 代理对象
            * method 代理的方法
            * args 方法的参数
            * */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName() + ":jdk动态，方法开始执行了");
                        Object invoke = method.invoke(myCalculator,args);
                        System.out.println(method.getName() + ":jdk动态，方法结束执行了");
                      return invoke;
                    }
                });

    }


}
