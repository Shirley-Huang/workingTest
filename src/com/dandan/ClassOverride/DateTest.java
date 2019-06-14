package com.dandan.ClassOverride;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    @Test
    public void testDateClass() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse("2018-06-19");
        System.out.println(date1.getTime());
        System.out.println(date1.compareTo(date));

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        System.out.println(date);
        System.out.println(calendar.get(Calendar.MINUTE));
        date.setMinutes(calendar.get(Calendar.MINUTE) + 10);
        System.out.println(date);

        calendar.set(Calendar.MINUTE,70);
        System.out.println(calendar.getTime());



    }
}
