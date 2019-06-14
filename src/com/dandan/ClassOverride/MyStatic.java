package com.dandan.ClassOverride;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/21
 * @Desciption :静态方法与实例方法的区别
 */
public class MyStatic {

    private int instanceVar;

    private static int staticVar;

    public static void staticMethod(){

        //静态方法不允许访问实例变量，因为实例成员变量是属于某个对象的，静态方法在执行时不一定存在对象
        //instanceVar = 1; 错误

        //静态方法不允许访问实例方法，因为实例方法可以访问实例变量，
        // 若静态方法可以访问实例方法就代表可以间接访问实例变量，所有不能调用
        //instanceProtectedMethod(); 错误


        //静态方法只能访问静态成员变量和静态成员方法
        staticVar = 10; //正确
        staticProtectedMethod(); //正确

    }

    public void instanceMethod(){

        //实例方法可以访问实例成员变量和实例方法，也可以访问静态成员变量和静态成员方法
        instanceVar = 1;//正确
        staticVar = 2;//正确
        instanceProtectedMethod();//正确
        staticProtectedMethod();//正确
    }

    static void staticProtectedMethod(){
        System.out.println("this is a static protected method");
    }

    void instanceProtectedMethod(){
        System.out.println("this is a instance protected method");
    }

}
