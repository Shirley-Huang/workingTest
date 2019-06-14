package com.dandan.ClassOverride;

import org.junit.Test;

import java.io.File;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :
 */
public class MyFiles {

    @Test
    public void fileMethodsTest() throws Exception{

        File file = new File("C:\\Users\\79974\\Desktop\\无法联系客户工单信息.html");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.toString());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getParent());










    }




}
