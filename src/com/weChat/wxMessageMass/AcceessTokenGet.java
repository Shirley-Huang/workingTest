package com.weChat.wxMessageMass;

import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/29
 * @Desciption :
 */
public class AcceessTokenGet {

    private static String weixinBaseUrl = "https://api.weixin.qq.com";
    private static String weixinClientId = "";
    private static String weixinClientKey = "";

    public static void main(String[] args) {

        /*PostMethod method = new PostMethod();
        method = new PostMethodWithGzip(url);
        StringRequestEntity requestEntity = new StringRequestEntity(jsonStr, "application/json", "UTF-8");
        method.setRequestEntity(requestEntity);


        Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "client_credential");
        params.put("appid", weixinClientId);
        params.put("secret", weixinClientKey);

        String url = weixinBaseUrl + "/cgi-bin/token";





        String tokenString = values.get("access_token").toString();*/
    }



}
