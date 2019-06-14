package com.dandan.ClassOverride;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.*;

public class MyMap {

    @Test
    public void testMapToString(){

        Boolean a = true;
        String sparePartsId = "123";
        String key = sparePartsId + a.toString();
        System.out.println(key);



        Map<String,Object> data = new HashMap<String, Object>();
        data.put("name","hdd");
        data.put("pwd","123");
        data.put("age","12");

        System.out.println(data.toString());

        Collection<Object> datas = data.values();
        System.out.println(datas.toString());

        List<Object> lists = new ArrayList<Object>();
        Set<Map.Entry<String, Object>> entries = data.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            lists.add(entry.getValue());
        }
        System.out.println(lists);




    }

    @Test
    public void testJsonToMap(){
        String str = "{\"reason\":\"成功\",\"result\":{\"realname\":\"黄丹丹\",\"idcard\":\"43052519960903352X\",\"res\":1},\"error_code\":0}";
        Map map = (Map) JSON.parse(str);
        System.out.println(map.toString());

        Object error_code = map.get("error_code");
        System.out.println(error_code);
        Object result = map.get("result");
        System.out.println(result);
        Map resultJson = (Map)JSON.parse(result.toString());
        String res = resultJson.get("res").toString();
        System.out.println(res);

        if(res.equals("1")){
            System.out.println("匹配");
        }else if(res.equals("2")){
            System.out.println("不匹配");
        }else{
            System.out.println("false");
        }


    }


}
