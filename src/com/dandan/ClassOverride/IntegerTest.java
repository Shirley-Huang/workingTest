package com.dandan.ClassOverride;

import org.junit.Test;

public class IntegerTest {


    public static void main(String[] args) {

        Integer applyAmount = new Integer(10);
        System.out.println(-applyAmount);

        boolean storeOffline = !tofalse();
        System.out.println(storeOffline);


    }

    @Test
    public void negateTest(){
        Integer a = 11;
        System.out.println();
    }


    public static boolean tofalse(){
        return false;
    }
}
