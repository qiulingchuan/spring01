package com.spm.om.aspectjAop;

import org.springframework.stereotype.Component;

/**
 * @author skyqlc
 * @name com.spm.om.aspectjAop
 * @create 2020/09/13:15:54
 */
@Component
public class CalculatorImpl implements  Calculator {
    @Override
    @Action
    public int add(int a, int b) {
        return a +b ;
    }

    @Override
    public void min(int a, int b) {
        System.out.println("a-b结果: "  + (a - b) );
    }
}
