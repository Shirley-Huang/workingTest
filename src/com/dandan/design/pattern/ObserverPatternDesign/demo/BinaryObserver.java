package com.dandan.design.pattern.ObserverPatternDesign.demo;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :实体观察者类
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(int num) {
        System.out.println(num + "的二进制：" + Integer.toBinaryString(num));
    }
}
