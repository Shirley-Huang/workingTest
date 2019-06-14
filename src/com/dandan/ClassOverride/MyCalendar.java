package com.dandan.ClassOverride;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class MyCalendar {

    @Test
    public void dayOfWeek(){

        Date date = new Date(2018 - 1900,9 - 1,27);// 2018-09-27 THU 4

        Calendar currentCalendar = Calendar.getInstance();//当前时间

        Calendar specifiedCalendar = Calendar.getInstance();
        specifiedCalendar.setTime(date);//指定时间

        int dayOweek_current = currentCalendar.get(Calendar.DAY_OF_WEEK);//该日期是本周的第几天
        int dayOweek_specified = specifiedCalendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(currentCalendar.getTime() + "-----" + dayOweek_current);
        System.out.println(specifiedCalendar.getTime() + "-----" + dayOweek_specified);

    }

    @Test
    public void weekInterval(){

        //Date date = new Date(2018 - 1900,9 - 1,27);// 2018-09-27 THU 4
        //Date date = new Date(2018 - 1900,9 - 1,27);// 2018-09-27 THU 4
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        /**
         * 1 - SUN   2 - MON
         */
        int dayOweek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayWeek = 0;
        if(dayOweek == 1){
            //如果是星期天
            dayWeek = 7;
        }else{
            dayWeek = dayOweek - 1;
        }
        System.out.println(dayWeek);

        int start = 1- dayWeek;
        int end = 7 - dayWeek;

        Calendar startTime = Calendar.getInstance();
        startTime.setTime(date);
        startTime.add(Calendar.DATE, start);
        Calendar endTime = Calendar.getInstance();
        endTime.setTime(date);
        endTime.add(Calendar.DATE, end);

        System.out.println(startTime.getTime());
        System.out.println(endTime.getTime());

    }

    @Test
    public void testAddDay(){
        Calendar now = Calendar.getInstance();
        System.out.println(now.getTime());

        Calendar before = Calendar.getInstance();

        before.add(Calendar.DATE,-7);
        System.out.println(now.getTime());
        System.out.println(before.getTime());

    }

    @Test
    public void testCalendarField(){

        Date finalDate = new Date("2019-01-12 18:15");
        Calendar finalCa = Calendar.getInstance();
        finalCa.setTime(finalDate);

        Calendar earlyTime = finalCa;
        earlyTime.add(Calendar.HOUR_OF_DAY, -(12));
        Calendar delayTime = finalCa;
        delayTime.add(Calendar.HOUR_OF_DAY, 12);
        System.out.println(earlyTime.getTime() + "----" + delayTime.getTime());
    }

    @Test
    public void timeStampCalendarTest(){
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTimeInMillis(1547298000000L);
        System.out.println(calendar1.getTime());

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(1547254800000L);
        System.out.println(calendar2.getTime());

        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(1547344800000L);
        System.out.println(calendar3.getTime());

        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(1547254800000L);
        System.out.println(calendar4.getTime());

        Calendar calendar5 = Calendar.getInstance();
        calendar5.setTimeInMillis(1547344800000L);
        System.out.println(calendar5.getTime());
    }

    @Test
    public void testLongToDate() throws Exception{
        Long timeStamp = 1547254800000L;
        Date date = new Date(timeStamp);
        System.out.println(date);

        Date date1 = new Date("2019/01/12 00:00:00");
        System.out.println(date1);

        Date date2 = new Date(0);
        System.out.println(date2);


    }

    @Test
    public void addMinuteTest(){
        Calendar currentTime = Calendar.getInstance();
        System.out.println(currentTime.getTime());
        currentTime.add(Calendar.MINUTE, -1440);
        System.out.println(currentTime.getTime());
    }



}
