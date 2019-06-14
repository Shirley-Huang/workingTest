package com.own.test.classLoader;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/25
 * @Desciption :
 */
public class ClassLoader02 extends ClassLoader01 {

    public static int a02 = 10;

    public static ClassLoader02 classLoader02 = new ClassLoader02();

    static{
        System.out.println("classLoader02 -------static method");
    }

    public ClassLoader02(){
        System.out.println("a02=" + a02  + "  b02=" + b02 + " aa=" + aa);
    }

    {
        System.out.println("instance method ---------------------");
    }

    public static int b02 = 20;
    int aa = 1;

}
