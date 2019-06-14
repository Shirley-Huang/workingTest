package com.dandan.design.pattern.ObserverPatternDesign.demo;

import java.util.Scanner;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/3/13
 * @Desciption :
 */
public class ObserverTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        //计算输入数据的二进制、八进制、十六进制

        do{
            Subject subject = new Subject();

            BinaryObserver binaryObserver = new BinaryObserver(subject);
            OctalObserver octalObserver = new OctalObserver(subject);
            HexaObserver hexaObserver = new HexaObserver(subject);
            subject.setNum(num);

            Subject subject2 = new Subject();
            BinaryObserver binaryObserver2 = new BinaryObserver(subject2);
            OctalObserver octalObserver2 = new OctalObserver(subject2);
            subject2.setNum(num + 10);


            num = scanner.nextInt();
        }while(num != 0);


    }



}
