package com.dandan.ClassOverride;

import org.junit.Test;

import java.util.Calendar;

public class DuringWeekDate {


    @Test
    public void getCurrentTimeWeekDuration(){


        Calendar calendar = Calendar.getInstance();
        Calendar beforeTime = Calendar.getInstance();
        Calendar afterTime = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(dayOfWeek);

        int offset = 1- dayOfWeek;
        beforeTime.add(Calendar.DATE, offset);
        System.out.println(beforeTime.getTime());

        int endSet = 7 - dayOfWeek;
        afterTime.add(Calendar.DATE,endSet);
        System.out.println(afterTime.getTime());
        System.out.println(calendar.getTime());



    }

    @Test
    public void test(){
        Calendar currentTime = Calendar.getInstance();
        int weekOfSet = currentTime.get(Calendar.DAY_OF_WEEK) - 1;
        int startSet = 1 - weekOfSet;
        int endSet = 7 - weekOfSet;
        Calendar beforeTime = Calendar.getInstance();
        beforeTime.add(Calendar.DATE, startSet);

        Calendar afterTime = Calendar.getInstance();
        afterTime.add(Calendar.DATE, endSet);

        System.out.println(beforeTime.getTime());
        System.out.println(afterTime.getTime());
    }

}
