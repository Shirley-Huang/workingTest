package com.dandan.ClassOverride;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NullTest {

    @Test
    public void test01(){
        List<String> orders = null;
        List<String> newOrders = new ArrayList<String>();
        for(String order : orders){
            newOrders.add(order);
        }
        System.out.println(orders);
        System.out.println(newOrders);
    }


}
