package com.dandan.ClassOverride;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/21
 * @Desciption :反射
 */
public class MyReflect {

    public void getClassObject() throws Exception{

        //获取class对象的四种实现方法
        //方法一
        MyReflect myReflect = new MyReflect();
        Class class1 = myReflect.getClass();

        //方法二
        Class class2 = MyReflect.class;

        try{
            //方法三
            Class class3 = Class.forName("com.dandan.ClassOverride.MyReflect");
        }catch(ClassNotFoundException e){
            throw e;
        }

        //方法四
        Class class4 = MyReflect.class.getClassLoader().loadClass("com.dandan.ClassOverride.MyReflect");

    }


    public static void main(String[] args){



    }

}
