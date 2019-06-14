package com.dandan.design.pattern.StatusPatternDesign;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/25
 * @Desciption :
 */
public class WaitAssignStatus implements IOrderStatusAction {

    @Override
    public Boolean doAction() throws Exception{

        System.out.println("判断是否自动派单");

        Boolean isAutoAssign = true;
        if(isAutoAssign){
            try{
                System.out.println("自动派单");
                throwException();

            }catch (Exception e){
                throw e;
            }
        }else{
            System.out.println("不自动派单");
            return false;
        }
        return true;
    }

    private void throwException() throws Exception{
        throw new RuntimeException();
    }

    @Override
    public void changeStatus() {

        System.out.println("修改状态到待沟通");
    }

    @Override
    public void insertOrderStatusContrail() {

        System.out.println("插入待沟通状态轨迹");
    }
}
