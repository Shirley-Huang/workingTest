package com.dandan.ClassOverride;

import org.junit.Test;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/20
 * @Desciption :
 */
public class MathTest {

    @Test
    public void roundTest(){

        System.out.println(8/2);

        System.out.println(Math.floor(7 / 2));
        System.out.println(Math.ceil(7 / 2));
        System.out.println(Math.round(7 / 2));
        System.out.println(Math.rint(7 / 2));
    }


}
