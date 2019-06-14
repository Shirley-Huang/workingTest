package com.dandan.design.pattern.StatusPatternDesign;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/25
 * @Desciption :
 */
public interface IOrderStatusAction {


    //修改工单状态
    Boolean doAction() throws Exception;


    //各状态需要的动作
    void changeStatus() throws Exception;

    //插入工单状态轨迹
    void insertOrderStatusContrail() throws Exception;



}
