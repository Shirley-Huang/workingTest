package com.dandan.ClassOverride;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

   // @Test
    //@Deprecated
    /*public void testModify() throws java.text.ParseException {
        Date formTime = timeSoltMapper.selectTimeSoltById(10).getFromTime();//12:30
        System.out.println(formTime);
        String date = "2018-06-15";
        Date dateTime = DateTimeUtilityTest.parseYYYYMMDD(date);
        System.out.println(dateTime);


        System.out.println("=========================date转换成Calendar");
        MyCalendar calendar1 = MyCalendar.getInstance();
        calendar1.setTime(dateTime);
        MyCalendar calendar2 = MyCalendar.getInstance();
        calendar2.setTime(formTime);
        calendar1.set(MyCalendar.HOUR,calendar2.get(MyCalendar.HOUR_OF_DAY));
        calendar1.set(MyCalendar.MINUTE,calendar2.get(MyCalendar.MINUTE));
        System.out.println(calendar2.get(MyCalendar.HOUR_OF_DAY));
        System.out.println(calendar2.get(MyCalendar.HOUR));
        System.out.println(calendar1.getTime());
        System.out.println(calendar2.getTime());
        System.out.println(calendar1.getTime());
        System.out.println(calendar1.getTimeInMillis());


        System.out.println("=========相加方法时间戳===========");
        //修改后的时间
        System.out.println(dateTime.getTime());
        System.out.println(formTime.getTime());
        System.out.println(dateTime.getTime() + formTime.getTime());
        System.out.println("=========过时方法时间戳==========");
        dateTime.setHours(formTime.getHours());
        dateTime.setMinutes(formTime.getMinutes());
        System.out.println(dateTime.getTime());

        System.out.println("============格式化日期时间戳=========");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date1 = dateFormat.parse("2018-06-15 12:30");
        System.out.println(date1);
        System.out.println(date1.getTime());

        System.out.println("========当前时间，无秒、毫秒");
        //当前时间
        MyCalendar calendar = MyCalendar.getInstance();
        calendar.set(MyCalendar.SECOND,0);
        calendar.set(MyCalendar.MILLISECOND,0);
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());





        System.out.println("==============");




    }*/


    @Test
    public void test(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MINUTE,24*60);
        System.out.println(calendar.getTime());
    }
}
