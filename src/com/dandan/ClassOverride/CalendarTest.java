package com.dandan.ClassOverride;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    //psvm
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.getTime());

        Date data = new Date();
        System.out.println(data);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
           data =  simpleDateFormat.parse("2018-05-18");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(data);

        now.setTime(data);
        System.out.println(now.getTime());

    }

    @Test
    public void test(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE, -1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MINUTE,-30);
        System.out.println(calendar.getTime());

        System.out.println("==================");
        Calendar calendar2 = Calendar.getInstance();
        System.out.println(calendar2.getTime());
        calendar2.add(Calendar.DATE, -1);
        System.out.println(calendar2.getTime());
        calendar2.add(Calendar.MINUTE,30);
        System.out.println(calendar2.getTime());

        System.out.println("----------------");
        calendar2.setTime(new Date());
        calendar2.add(Calendar.DATE, 1);
        System.out.println(calendar2.getTime());
    }

    @Test
    public void testMinute(){

        Date agreeDate = new Date(2018 - 1900,11 - 1,16);
        Date fromTime = new Date(2018 - 1900,11 - 1,16,12,0);

        Calendar finalAgreeSoltFromTime = Calendar.getInstance();
        finalAgreeSoltFromTime.setTime(fromTime);

        Calendar finalAgreeDateFromTime = Calendar.getInstance();
        finalAgreeDateFromTime.setTime(agreeDate);
        finalAgreeDateFromTime.set(Calendar.HOUR_OF_DAY, finalAgreeSoltFromTime.get(Calendar.HOUR_OF_DAY));
        finalAgreeDateFromTime.set(Calendar.MINUTE, finalAgreeSoltFromTime.get(Calendar.MINUTE) - 30);

        System.out.println(finalAgreeDateFromTime.getTime());
    }


}
