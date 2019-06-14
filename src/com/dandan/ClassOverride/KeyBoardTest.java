package com.dandan.ClassOverride;

public class KeyBoardTest {

    //psvm
    public static void main(String[] args) {

        //sout  换行
        System.out.println("sout");

        //serr
        System.err.println("serr");

        //souf    不换行
        System.out.printf("souf");

        //soutm   打印当前类名.当前方法名
        System.out.println("CalendarTest.main");
        System.out.printf("soutm");

        //soutp   打印当前方法的参数名和值
        System.out.println("args = [" + args + "]");
        System.out.println("true = " + true);

    }


    public void test01(String name,int age){

        //soutm
        System.out.println("KeyBoardTest.test01");

        //soutv
        System.out.println("a = " + age);
        System.out.println("age = " + age);
        System.out.println("this = " + this);

        //soutp
        System.out.println("name = [" + name + "], age = [" + age + "]");
    }

}
