package com.dandan.design.pattern.ObserverPatternDesign.demo;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(int num){
        System.out.println(num + "的八进制：" + Integer.toOctalString(num));
    }
}
