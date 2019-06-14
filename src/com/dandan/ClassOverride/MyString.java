package com.dandan.ClassOverride;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyString {

    @Test
    public void testIndexOf(){
        String str = "https://cbs-merchant.jiangyunshouhou.com";
        int index = str.indexOf(".",0);
        System.out.println(index);
    }

    @Test
    public void subStringTest(){
        String str = "云丁-匠云-北京2号仓库";
        String shortName = "云鼎";
        int index = str.indexOf("-",0);
        System.out.println(index);
        System.out.println(str.length());
        String newString = str.substring(index, str.length());
        System.out.println(newString);
        String newStr = shortName + newString;
        System.out.println(newStr);

        String st2 = "jiangyun02";
        System.out.println(st2.substring(st2.length() - 2, st2.length()));


    }

    @Test
    public void containsTest(){
//        String str = "【系统】客户反馈师傅未沟通直接设置了上门时间";
//        String s = "【系统】客户反馈师傅【系统】客户反馈师傅未沟通直接设置了上门时;";

        String str = "2";
        String s = "2815,1231,285";

        List<String> strings = Arrays.asList(s.split(","));

        if(strings.contains(str)){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }


//        List<String> strings = Arrays.asList(s);
//        System.out.println(strings);
//        for (String string : strings) {
//            System.out.println(string);
//        }
//        if(strings.contains(str)){
//            System.out.println("包含");
//        }else{
//            System.out.println("不包含");
//        }
    }

    @Test
    public void testTime(){
        System.out.println(System.currentTimeMillis());

        Double aDouble = Double.valueOf("0.04");
        System.out.println(aDouble);

        BigDecimal aba = new BigDecimal(aDouble).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(aba);

        BigDecimal amount = new BigDecimal(66);
        System.out.println(amount.multiply(aba));
    }

    @Test
    public void testEmptyArray() {
        List<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("12");
        arr.add("21");

        System.out.println("系统自动完结" + arr.toString());

        StringBuffer stringBuffer = new StringBuffer();
        for (String s : arr) {
            stringBuffer.append(s).append("、");
        }
        System.out.println(stringBuffer.toString());
        stringBuffer.deleteCharAt(stringBuffer.length() - 1).append("问题");
        System.out.println(stringBuffer.toString());
    }

    @Test
    public void StringBufferTest(){
        StringBuffer stringBuffer = new StringBuffer();
        String employeeNote = "取消工单（2019-03-04）";
        StringBuffer problemNote = new StringBuffer(",自动完结问题");
        int index = employeeNote.indexOf("（");
        stringBuffer.append(employeeNote);
        stringBuffer.insert(index, problemNote);

        System.out.println(stringBuffer.toString());

    }

    @Test
    public void test02(){
        if(1 > 0 && null == null){
            System.out.println("1");
        }
    }

}
