package com.dandan.ClassOverride;

import org.junit.Test;

public class StringUtils {

    public static void main(String[] args) {
        /*String str = "";
        System.out.println(str.length());

        String str2 = null;
        System.out.println(str2);*/
        test01("");
    }

    @Test
    public static void test01(String str1){

        String a = str1;
        System.out.println("a:" + a +".");
        if(a == null){
            System.out.println("a is null");
        }

    }



}
