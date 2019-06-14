package com.own.test.ResultResponse;

public class ResultResponseTest {


    public static void main(String[] args) {
        ResultResponse response = test01(0);
        System.out.println(response);

    }

    public static ResultResponse test01(int i){
        ResultResponse resultResponse = new ResultResponse();

        if(i == 1){
            ResultResponseVO resultResponseVO = new ResultResponseVO();
            resultResponseVO.setAge(21);
            resultResponseVO.setName("dd");
        }

        return resultResponse;

    }

}
