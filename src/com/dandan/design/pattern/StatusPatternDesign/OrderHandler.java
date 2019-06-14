package com.dandan.design.pattern.StatusPatternDesign;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/25
 * @Desciption :
 */
public class OrderHandler {

    public static void main(String[] args) throws Exception{

        MyOrder order = new MyOrder();
        order.setOrderId("1");
        order.setOrderStatus(OrderStatus.WAITING_ASSIGN);
        order.setPartnerOrderNumber("222");

        Content content = new Content();
        content.setOrder(order);
        try{
            content.doChange();
        }catch (Exception e){
            System.out.println("yichang,事务状态回滚");
        }

    }


}
