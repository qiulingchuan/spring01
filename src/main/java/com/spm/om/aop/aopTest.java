package com.spm.om.aop;

/**
 * @author skyqlc
 * @name com.spm.om.aop
 * @create 2020/09/13:15:36
 */
public class aopTest {

    public static void main(String[] args) {
        MyCalculatorImpl myCalculator=new MyCalculatorImpl();
        MyCalculator calculator=(MyCalculator) MyCalculatorProxy.getInastance(myCalculator);
        int cnt = calculator.add(4,5);
        System.out.println(cnt);

    }
}
