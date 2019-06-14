package com.dandan.ClassOverride;

import org.junit.Test;

public class OrTest {

    @Test
    public void test01(){
        Integer a  = 10;
        Integer b = 10;

        if(a > 0 || b > 0){
            System.out.println("a = 10 and b = 10");
        }


        a = 0;
        if(a > 0 || b > 0){
            System.out.println("a = 0 and b = 10");
        }


    }



}
