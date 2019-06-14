package com.dandan.design.pattern.StatusPatternDesign;

import java.io.Serializable;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/25
 * @Desciption :
 */
public class MyOrder implements Serializable {

    private String orderId;
    private OrderStatus orderStatus;
    private String partnerOrderNumber;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPartnerOrderNumber() {
        return partnerOrderNumber;
    }

    public void setPartnerOrderNumber(String partnerOrderNumber) {
        this.partnerOrderNumber = partnerOrderNumber;
    }
}
