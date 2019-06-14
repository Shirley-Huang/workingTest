package com.dandan.design.pattern.ObserverPatternDesign.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :观察者模式：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变是，所有依赖于他的对象都得到通知并被自动更新
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        notifyAllObserver(num);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObserver(int num){
        for (Observer observer : observers) {
            observer.update(num);
        }
    }
}
