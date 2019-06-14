package com.dandan.ClassOverride;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("============ClassOverride=============");
        Map<String,Process> maps = new LinkedHashMap<String, Process>();
        maps.put("WAIT_CONCATE",new Process("zhangsan",12));
        maps.put("WAIT_GARB",new Process("lisi",14));
        maps.put("WAIT_SERVE",new Process("wanger",16));

        for(Map.Entry<String,Process> map : maps.entrySet()){
            Process value = map.getValue();
            if (map.getKey() == "2") {
                value.setAge(999);
            }

        }

        for(Map.Entry<String,Process> map : maps.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue().getAge());
        }




    }
}
