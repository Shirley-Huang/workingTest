package com.own.test.ReflectTest;

import java.util.Random;

enum CartoonCharacter implements Generator{
    SLAPPY,
    SPANKY,
    PUNCHY,
    SILLY,
    BOUNCY,
    NUTTY,
    BOB;

    private Random random = new Random(47);

    public CartoonCharacter next(){
        return values()[random.nextInt(values().length)];
    }
}

public class EnumImplelmentation {
    public static <T> void printNext(Generator rg){
        //System.out.println(rg.next() + ".");
    }

    public static void main(String[] args){
        CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10; i++){
            printNext(cc);
        }
    }
}
