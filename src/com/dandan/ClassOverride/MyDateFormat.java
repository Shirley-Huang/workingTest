package com.dandan.ClassOverride;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/10
 * @Desciption :
 */
public class MyDateFormat {

    @Test
    public void SimpleDateFormatTest(){
        SimpleDateFormat df = new SimpleDateFormat("MM月dd日");//设置日期格式
        String finalAgreeDate =  df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳;
        System.out.println(finalAgreeDate);
    }


}
