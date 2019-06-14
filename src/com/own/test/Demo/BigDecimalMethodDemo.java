package com.own.test.Demo;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalMethodDemo {

    @Test
    public void test01(){
        BigDecimal bigDecimal = new BigDecimal(2.375);
        System.out.println(bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP));

        System.out.println(bigDecimal.negate());
        System.out.println(bigDecimal.negate(MathContext.DECIMAL64));
        System.out.println(bigDecimal.negate(MathContext.DECIMAL32));

        System.out.println(bigDecimal.plus());
        System.out.println(bigDecimal.plus(MathContext.DECIMAL64));

    }
}
