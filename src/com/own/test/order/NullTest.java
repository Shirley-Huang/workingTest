package com.own.test.order;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NullTest {


    @Test
    public void testNull(){

        System.out.println(new BigDecimal(200).doubleValue() > 200.00);

        int a = 3;
        BigDecimal bigDecimal = new BigDecimal(Math.sqrt(a));
        System.out.println(bigDecimal.intValue());

        System.out.println(bigDecimal.doubleValue());
        System.out.println(bigDecimal.floatValue());
        System.out.println(bigDecimal.longValue());
        System.out.println(bigDecimal.shortValue());

        List<String> artisans = new ArrayList<String>();
        List<String> ids = new ArrayList<String>();
        for(String artisan : artisans){
            ids.add(artisan);
        }

        System.out.println(ids);

    }
}
