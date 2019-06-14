package com.dandan.ClassOverride;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/21
 * @Desciption :
 */
public class StringTest {

    @Test
    public void indexOfTest(){

        List<String> ids = Arrays.asList("36","37");

        if(ids.indexOf(37) != -1){
            System.out.println(37);
        }else{
            System.out.println("error");
        }

        if(ids.indexOf("37") != -1){
            System.out.println(37);
        }else{
            System.out.println("error");
        }


    }



}
