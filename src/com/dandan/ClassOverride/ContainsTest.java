package com.dandan.ClassOverride;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContainsTest {

    @Test
    public void contailsTest(){
        List<Integer> aList = new ArrayList<Integer>();
        aList.add(1);
        aList.add(2);
        aList.add(3);

        List<Integer> bList = new ArrayList<Integer>();
        bList.add(2);
        bList.add(3);

        List<Integer> removeList = new ArrayList<Integer>();

        for(Integer list : aList){
            if(!bList.contains(list)){
                System.out.println("不包含" + list);
                removeList.add(list);
            }else{
                System.out.println("包含"+list);
            }
        }
        System.out.println(removeList.toString());
    }
}
