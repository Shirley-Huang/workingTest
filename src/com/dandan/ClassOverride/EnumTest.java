package com.dandan.ClassOverride;

public class EnumTest {

    public static void main(String[] args) {
        for(fruit code : fruit.values()){
            System.out.println(code.name);
        }

        String applyCode = "APPLE";
        if(applyCode != null){

            System.out.println(fruit.valueOf(applyCode));
        }
    }


}

enum fruit{
    APPLE(1,"APPLE","苹果"),
    PEAR(2,"PEAR","梨");

    int id;
    String code;
    String name;

    fruit(int id,String code,String name){
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}