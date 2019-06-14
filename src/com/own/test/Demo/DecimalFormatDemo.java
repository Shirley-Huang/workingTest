package com.own.test.Demo;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DecimalFormatDemo {

    @Test
    public void test01(){
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("####,####.####%");

        Double a = 20.356;

        String result =  decimalFormat.format(a);

        System.out.println(result);//2035.6%

        DecimalFormat decimalFormat1 = new DecimalFormat("0000,00.000%");
        System.out.println(decimalFormat1.format(a));//0020,35.600%

    }

    @Test
    public void test02(){
        List<String> alist = new ArrayList<String>();
        alist.add("1");
        System.out.println(alist.size());
    }

    @Test
    public void test03(){
        String id = "2222";
        System.out.println(id +"----"+ id.getClass());
        Integer intId = Integer.valueOf(id);
        System.out.println(intId +"----"+ intId.getClass());
    }

    @Test
    public void test04(){
        /*List<String> orderIds = null;
        List<Integer> orders = new ArrayList<Integer>();
        for(String orderId : orderIds){
            orders.add(Integer.valueOf(orderId));
        }
        System.out.println(orders.size());*/

        List<String> orderIds = new ArrayList<String>();
        for(String orderId : orderIds){
            System.out.println("没毛病");
        }
        if(orderIds != null){
            System.out.println("not null");
        }
        if(orderIds.size() > 0){
            System.out.println("size gt 0");
        }
        if(orderIds.size() == 0){
            System.out.println("size eq 0");
        }


    }
}
