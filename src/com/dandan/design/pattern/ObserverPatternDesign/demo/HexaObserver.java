package com.dandan.design.pattern.ObserverPatternDesign.demo;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(int num){
        System.out.println(num + "的十六进制：" + Integer.toHexString(num));
    }
}
