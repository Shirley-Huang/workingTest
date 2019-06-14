package com.utils;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.*;

public class IdentityTest {


    @Test
    public void testExcelTest(){

        List<List<String>> lists = ImportExcelUtils.readExcel("C:\\Users\\79974\\Desktop\\artisans.xls");
        List<List<String>> errorIdentity = new ArrayList<List<String>>();
        //行数据
        for (List<String> list : lists) {
            //列数据
            boolean isTrue = IdentityCheckUtils.isValidIdNo(list.get(2));
            if(!isTrue){
                errorIdentity.add(list);
            }
        }
        System.out.println(errorIdentity.size());
        //System.out.println(Arrays.toString(new List[]{errorIdentity}));
        for (List<String> strings : errorIdentity) {
            for (String string : strings) {
                System.out.print(string + "\t\t");
            }
            System.out.println();
        }


    }


    @Test
    public void testArtisanOrderTest(){

        List<List<String>> lists = ImportExcelUtils.readExcel("C:\\Users\\79974\\Desktop\\artisan\\all_artisan.xls");
        List<List<String>> errorIdentity = new ArrayList<List<String>>();
        //行数据
        for (List<String> list : lists) {
            //列数据
            boolean isTrue = IdentityCheckUtils.isValidIdNo(list.get(3));
            if(!isTrue){
                errorIdentity.add(list);
            }
        }
        System.out.println(errorIdentity.size());
        //System.out.println(Arrays.toString(new List[]{errorIdentity}));
        for (List<String> strings : errorIdentity) {
            for (String string : strings) {
                System.out.print(string + "-");
            }
            System.out.println();
        }
    }


    @Test
    public void testOneIdentityCard(){
        String cardId = "140225199701190311";
        //String cardId = "43052519960903352x";
        //String cardId = "130638199402043532";
        boolean isTrue = IdentityCheckUtils.isValidIdNo(cardId);
        System.out.println(isTrue);
    }


    //@Test
    public void testIdentityCardTest(){

        List<List<String>> lists = ImportExcelUtils.readExcel("C:\\Users\\79974\\Desktop\\artisan\\all_artisan.xls");
        List<List<String>> errorFormat = new ArrayList<List<String>>();
        List<List<String>> errorIdentity = new ArrayList<List<String>>();
        List<List<String>> successedIdentity = new ArrayList<List<String>>();
        //行数据
        for (List<String> list : lists) {
            //列数据
            String realName = list.get(2);
            String idcard = list.get(3);

            if(StringUtils.isNotBlank(realName) && StringUtils.isNotBlank(idcard)){
                boolean isTrue = IdentityCheckUtils.isValidIdNo(idcard);
                if(isTrue){
                    //TODO调用api接口
                    //Boolean isMatch = IdentityAPIDemo.IdentityCardAPICheck(idcard, realName);
                    Boolean isMatch = false;
                    if(isMatch){
                        //实名认证成功的师傅数据
                        successedIdentity.add(list);
                    }else{
                        //实名认证失败的师傅数据
                        errorIdentity.add(list);
                    }
                }else{
                    //身份格式错误的数据
                    errorFormat.add(list);
                }

            }else{
                //身份格式错误的数据
                errorFormat.add(list);

            }
        }

        //打印身份格式错误的数据
        System.out.println("身份格式错误的数据有：" + errorFormat.size());
        for (List<String> strings : errorFormat) {
            for (String string : strings) {
                System.out.print(string + "?");
            }
            System.out.println();
        }

        //打印身份格式正确但姓名与身份证号不匹配的数据
        System.out.print("\n\n\n\n\n\n===================================================");
        System.out.print("身份格式正确但姓名与身份证号不匹配的数据有：" + errorIdentity.size());
        System.out.println("=============================================================\n\n");
        for (List<String> strings : errorIdentity) {
            for (String string : strings) {
                System.out.print(string + "?");
            }
            System.out.println();
        }

        //打印身份格式正确且姓名与身份证号匹配成功的数据
        System.out.print("\n\n\n\n\n\n====================================================");
        System.out.print("身份格式正确且姓名与身份证号匹配成功的数据有：" + successedIdentity.size());
        System.out.println("==============================================================\n\n");
        for (List<String> strings : successedIdentity) {
            for (String string : strings) {
                System.out.print(string + "?");
            }
            System.out.println();
        }
    }






}
