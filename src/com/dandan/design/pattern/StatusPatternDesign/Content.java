package com.dandan.design.pattern.StatusPatternDesign;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/25
 * @Desciption :
 */
public class Content {

    IOrderStatusAction status;
    MyOrder order;

    public MyOrder getOrder() {
        return order;
    }

    public void setOrder(MyOrder order) {
        this.order = order;
    }

    public void doChange() throws Exception{
        OrderStatus orderStatus = order.getOrderStatus();
        switch (orderStatus){
            case WAITING_ASSIGN: status = new WaitAssignStatus();break;
            //case WAITING_COMMUNICATE:status = new WaitCommunicateStatus();break;
        }
        Boolean continueChangeStatus = status.doAction();
        if(continueChangeStatus){
            status.changeStatus();
            status.insertOrderStatusContrail();
        }
    }
}
