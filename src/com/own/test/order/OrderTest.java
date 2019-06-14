package com.own.test.order;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {

    public static void main(String[] agrs) {
        Order order = new Order();
        List<String> strings = new ArrayList<String>();
        strings.add("A");
        order.setOrderStatus(strings);

        aaaaa(order);
        for (String s : order.getOrderStatus()) {
            System.out.println(s);
        }
    }

    private static void aaaaa(Order order) {
        order.getOrderStatus().add(0, "b");
    }
}
