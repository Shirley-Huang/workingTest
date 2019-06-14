package com.dandan.design.pattern.ObserverPatternDesign.impl;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :
 */
public abstract class ListenObserver {

    protected CartListenObserver cartListenObserver;

//    @Override
//    public void onChange(){
//
//    }



    public interface IListenObserver{
        public void onChange();
    }

}
