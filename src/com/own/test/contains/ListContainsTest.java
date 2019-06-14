package com.own.test.contains;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListContainsTest {

    public static void main(String[] args){


        List<MoilePushApp> apps = initMobilePushApp();

        MoilePushApp mobilePushApp = new MoilePushApp();

        mobilePushApp.setCode("ARTISAN");
        System.out.println(mobilePushApp.toString());

        if(apps.contains(mobilePushApp)){
            System.out.println("ture");
        }else {
            System.out.println("false");
        }
    }

    public static List<MoilePushApp> initMobilePushApp(){
        List<MoilePushApp> apps = new ArrayList<MoilePushApp>();
        MoilePushApp app1 = new MoilePushApp();
        app1.setId(1);
        app1.setCode("SCRAT");
        app1.setName("scrat");
        app1.setAppKey("24617189");
        app1.setDailyLimit(100000);
        app1.setDeviceType("ANDROID");

        MoilePushApp app2 = new MoilePushApp();
        app2.setId(2);
        app2.setCode("ARTISAN");
        app2.setName("artisan");
        app2.setAppKey("24841976");
        app2.setDailyLimit(100000);
        app2.setDeviceType("ANDROID");


        for (MoilePushApp app : apps) {
            System.out.println(app.toString());
        }

        return apps;
    }

    @Test
    public void dateTest(){
        System.out.println(new Date().toString());
    }

    @Test
    public void subStringTest(){
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.toString() + " ");

        sb.append("kdk;iieie;oeioeei;");
        String[] split1 = sb.toString().split(";");
        System.out.println(split1.length+"==========================");
        for (String s : split1) {
            System.out.println(s);
        }

        String str1 = sb.toString();
        String str2 = str1.substring(0, str1.length() - 1);
        System.out.println(str2);

        String[] split2 = str2.split(";");
        System.out.println(split2.length+"==========================");
        for (String s : split2) {
            System.out.println(s);

        }
    }


    @Test
    public void testGetIndex(){
        List<Integer> strs = new ArrayList<Integer>();
        strs.add(1);


        List<Integer> statusIds = new ArrayList<Integer>();
        statusIds.add(1);
        statusIds.add(2);
        statusIds.add(3);

        for (Integer statusId : statusIds) {
            if(strs.contains(statusId)){
                System.out.println(statusId + "--------------");
            }
            if(!strs.contains(statusId)){
                System.out.println(statusId);
            }
        }


    }


}
