package com.own.test.classLoader;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/25
 * @Desciption :
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader02 o2 = new ClassLoader02();
        System.out.println("main method---------------");
    }

    @Test
    public void test01(){
        List<String> lists = new ArrayList<String>();
        lists.add("a");
        lists.add("a");
        lists.add("a");
        lists.add(null);
        lists.add("3");

        System.out.println(lists.size());
        for (String list : lists) {
            System.out.println(list.toString());
        }

    }

    @Test
    public void test02(){
        Date d1 = new Date("2019/03/27");
        Date d2 = new Date("2019/03/27");
        System.out.println(d1);
        System.out.println(d2);

        if(d1.getTime() == d2.getTime()){
            System.out.println("true");
        }
    }


}
