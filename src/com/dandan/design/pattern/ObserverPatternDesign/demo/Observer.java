package com.dandan.design.pattern.ObserverPatternDesign.demo;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :抽象观察者类
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update(int num);

}
