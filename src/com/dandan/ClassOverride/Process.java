package com.dandan.ClassOverride;

public class Process {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Process(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
