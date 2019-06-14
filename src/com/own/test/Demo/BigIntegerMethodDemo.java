package com.own.test.Demo;

import org.junit.Test;

import java.math.BigInteger;

public class BigIntegerMethodDemo {

    @Test
    public void test01(){
        Integer a = new Integer(2);
        int compareTo = a.compareTo(3);

        BigInteger bigInteger = new BigInteger("5");
        System.out.println(bigInteger.negate());

        bigInteger.negate();
        System.out.println(bigInteger);

        bigInteger.or(new BigInteger("2"));
        System.out.println(bigInteger);
        System.out.println(bigInteger.or(new BigInteger("2")));

    }

}
