package com.weChat.wxMessageMass.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


import net.sf.json.JSONObject;
import org.junit.Test;

/*
<!-- https://mvnrepository.com/artifact/net.sf.json-lib/json-lib -->
        <dependency>
        <groupId>net.sf.json-lib</groupId>
        <artifactId>json-lib</artifactId>
        <version>2.4</version>
        </dependency>
*/

public class IdentityAPIDemo {


    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";

    //配置您申请的KEY
    //public static final String APPKEY ="*************************";
    public static final String APPKEY ="10375817584c28eace434a4f642d8f9b";



    /**
     *
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return  网络请求字符串
     * @throws Exception
     */
    public static String net(String strUrl, Map params,String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if(method==null || method.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(method==null || method.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlencode(params));
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }

    //将map型转为请求参数型
    public static String urlencode(Map<String,Object>data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }


    /**
     * Xml string转换成Map
     * @param xmlStr
     * @return
     */
    public static Map<String,Object> xmlString2Map(String xmlStr){
        Map<String,Object> map = new HashMap<String,Object>();
        Document doc;
        try {
            doc = DocumentHelper.parseText(xmlStr);
            Element el = doc.getRootElement();
            map = recGetXmlElementValue(el,map);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return map;
    }


    /**
     * 循环解析xml
     * @param ele
     * @param map
     * @return
     */
    @SuppressWarnings({ "unchecked" })
    private static Map<String, Object> recGetXmlElementValue(Element ele, Map<String, Object> map){
        List<Element> eleList = ele.elements();
        if (eleList.size() == 0) {
            map.put(ele.getName(), ele.getTextTrim());
            return map;
        } else {
            for (Iterator<Element> iter = eleList.iterator(); iter.hasNext();) {
                Element innerEle = iter.next();
                recGetXmlElementValue(innerEle, map);
            }
            return map;
        }
    }

    //@Test
    public void createMap(){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("idcard","130638199402043532");//身份证号码
        data.put("realname","梁凤山");//真实姓名
        data.put("key",APPKEY);

        String url = new String("http://op.juhe.cn/idcard/query");//身份证实名查询url
        try {
            String response = net(url, data, "POST");
            System.out.println(response);
            //     Map<String, Object> stringObjectMap = xmlString2Map(response);
            //    Object error_code = stringObjectMap.get("error_code");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //@Test
    public void testCheck(){
        String idcard = "43052519960903352X";
        String realName = "黄丹丹";
        Boolean isMatch = IdentityCardAPICheck(idcard, realName);
        System.out.println(isMatch);
    }

    public static Boolean IdentityCardAPICheck(String idcard, String realName){

        Boolean isMatch = false;
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("idcard",idcard);//身份证号码
        data.put("realname",realName);//真实姓名
        data.put("key",APPKEY);
        System.out.println(data.toString());

        String url = new String("http://op.juhe.cn/idcard/query");//身份证实名查询url
        try {
            String response = net(url, data, "POST");
            System.out.println(response);

            Map map = (Map) JSON.parse(response);
            String error_code = map.get("error_code").toString();
            if(error_code.equals("0")){
                //请求成功
                Map result = (Map) JSON.parse(map.get("result").toString());
                String res = result.get("res").toString();
                if(res.equals("1")) {
                    isMatch = true;
                }
            }else{
                //请求失败
                isMatch = false;
            }
        } catch (Exception e) {
            isMatch = false;
        }

        return isMatch;
    }

}
