package com.own.test.classLoader;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/25
 * @Desciption :
 */
public class ClassLoader01 {

    public static void main(String[] args) {
        System.out.println("main method ------------------");
        funcationTest02();
    }

    public static ClassLoader01 staticObj = new ClassLoader01();
    //public static int var = 10;

    static {
        System.out.println("static code ---------------------");
    }

    {
        System.out.println("annonimo code-----------------");
    }

    ClassLoader01(){
        System.out.println("contruct method---------------");
        System.out.println("a="+a + "  b=" + b);
    }

    static void funcationTest02(){
        System.out.println("funcationTest02()----------------------");
    }


    static int b = 12;
    int a = 12;
}
