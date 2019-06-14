package com.dandan.ClassOverride;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal original = new BigDecimal(50);
        BigDecimal newNum = new BigDecimal(80);

        BigDecimal result = original.subtract(newNum);

        BigDecimal total = new BigDecimal(250);
        BigDecimal newTotal = total.add(result.negate());

        System.out.println(result);
        System.out.println(result.negate());
        System.out.println(newTotal);

        newTotal.add(new BigDecimal(20));
        System.out.println(newTotal);



    }

    @Test
    public void testBigDecimalMultiply(){
        BigDecimal bd = new BigDecimal(20);
        Integer amount = bd.multiply(new BigDecimal(100)).intValue();
        System.out.println(amount);
    }


    @Test
    public void testBigDecimalZero(){
        /*Scanner input = new Scanner(System.in);

        BigDecimal bigDecimal = new BigDecimal(-1.9);
        System.out.println(bigDecimal);


        if(bigDecimal.compareTo(BigDecimal.ZERO) == 1){
            System.out.println(bigDecimal);
            System.out.println("大于0");
        }else if(bigDecimal.compareTo(BigDecimal.ZERO) == 0){
            System.out.println("等于0");
        }else{
            System.out.println("小于0");
        }*/


        Integer amount = 20;
        BigDecimal applyAmount = new BigDecimal(amount);
        BigDecimal outboundPrice = new BigDecimal(45.78);
        BigDecimal originalDepositAmount = new BigDecimal(50000);

        BigDecimal newDepositAmount = new BigDecimal(0);
        BigDecimal useDepositAmount = applyAmount.multiply(outboundPrice).setScale(2, BigDecimal.ROUND_HALF_UP);
        newDepositAmount = originalDepositAmount.subtract(useDepositAmount);


        System.out.println(newDepositAmount);


    }

    @Test
    public void test01(){

        BigDecimal a = new BigDecimal(10.00);
        BigDecimal b = new BigDecimal(80);

        System.out.println(a.compareTo(b) != 0);

       String ab = a.multiply(b).toString();
       System.out.println(ab);

        String s = new BigDecimal(1.00).multiply(new BigDecimal(100)).toString();
        System.out.println(s);


    }

    public void test02(BigDecimal config){
        String s = config.multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(s);
    }


    @Test
    public void test03(){
        System.out.println(new BigDecimal(89.50000));
        BigDecimal decimal = new BigDecimal(89.5000);
       decimal = decimal.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(decimal);
        test02(decimal);


        BigDecimal zero = new BigDecimal(0);
        zero = zero.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(zero);
    }




}
