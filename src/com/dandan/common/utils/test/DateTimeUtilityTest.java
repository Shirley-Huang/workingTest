package com.dandan.common.utils.test;

import com.dandan.common.utils.DateTimeUtility;
import com.dandan.common.utils.TimeRange;

import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/25
 * @Desciption :
 */
public class DateTimeUtilityTest {

    public static void main(String[] args) {

        Date from = DateTimeUtility.getFirstDayOfLastMonth(new Date());
        Date toDate = DateTimeUtility.getLastDayOfLastMonth(new Date());
        System.out.println(from);
        System.out.println(toDate);
        Date to = DateTimeUtility.getMaxTimeOfDay(toDate);
        System.out.println(to);

    }



}
