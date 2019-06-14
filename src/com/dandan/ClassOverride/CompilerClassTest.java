package com.dandan.ClassOverride;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/22
 * @Desciption :
 */
class compilerClassTest{
    public static void main(String[] args) throws Exception{

        int i = 1;
        Integer ii = new Integer(0);

        method01();

        Animal animal = new Animal("HuangDandan",new Integer(22));
        System.out.println(animal.getName() + "age :" + animal.getAge());


    }

    public static void method01(){
        System.out.println("this is static method");
    }

}

class Animal
{
    private String name;
    private Integer age;

    Animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}