package com.dandan.design.pattern.ObserverPatternDesign.impl;

import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :
 */
public class Cart {

    private List<Goods> carts;

    public List<Goods> getCarts() {
        return carts;
    }

    public void setCarts(List<Goods> carts) {
        this.carts = carts;
    }
}
