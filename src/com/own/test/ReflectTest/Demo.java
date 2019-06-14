package com.own.test.ReflectTest;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore{
    ONE,
    TWO,
    THREE
}

public class Demo {

    public static Set<String> analyze(Class<?> enumClass){

        System.out.println("interfaces:------------------");
        Type[] genericInterfaces = enumClass.getGenericInterfaces();
        for(Type interf : genericInterfaces){
            System.out.println(interf);
        }

        System.out.println("superClass-----------------------");

        Class<?> superclass = enumClass.getSuperclass();
        System.out.println(superclass);

        System.out.println("genericSuperClass--------------------");

        Type genericSuperclass = enumClass.getGenericSuperclass();
        System.out.println(genericSuperclass);

        Set<String> methodSet = new TreeSet<String>();

        System.out.println("methods----------------");
        Method[] methods = enumClass.getMethods();
        for(Method method : methods){
            System.out.println(method);
            methodSet.add(method.getName());
        }

        return  methodSet;

    }

    public static void main(String[] args){
        //枚举类反射
        //Set<String> exploreMethods = analyze(Explore.class);

        System.out.println("======================");

        //Enum反射
        //Set<String> enumMethods = analyze(Enum.class);

        //OSExecute.command("javap Explore");


    }


}
