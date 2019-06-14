package com.utils;

import org.junit.Test;

import java.util.*;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/19
 * @Desciption :
 */
public class AverageCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int count = 0;

        List<Integer> originCart = new ArrayList<Integer>();
        Integer cartNum = 0;
        do{
            cartNum = scanner.nextInt();
            if(cartNum != 0){
                originCart.add(cartNum);
                sum += cartNum;
                count++;
            }
        }while(cartNum != 0);

        avg = sum/count;
        System.out.println("sum=" + sum + " avg=" + avg);

        System.out.println(originCart.toString());
        Collections.sort(originCart);
        System.out.println(originCart.toString());
        Collections.reverse(originCart);
        System.out.println(originCart.toString());
        for (int i = 0; i < originCart.size() - 1; i++) {
            if(originCart.get(i) - avg > 0){
                originCart.set(i+1,originCart.get(i+1) + originCart.get(i) - avg);
                originCart.set(i,avg);
                System.out.println(originCart.toString());
            }
        }

        System.out.println(originCart.toString());



    }

    @Test
    public void lsls(){
        List<String> ast = new ArrayList<String>();
        ast.add("1");
        ast.add("2");
        ast.add("3");
        ast.add("4");
        ast.add("5");

        List<String> needs = new ArrayList<String>();

        List<String> needIds = ast.subList(0, 2);
        needs.addAll(needIds);
        System.out.println(ast.toString());
        System.out.println(needs.toString());
        ast.removeAll(needIds);
        System.out.println(ast.toString());
        System.out.println(needs.toString());

    }



}
