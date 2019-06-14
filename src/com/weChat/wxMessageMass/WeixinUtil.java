package com.weChat.wxMessageMass;

import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;

import java.io.IOException;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/29
 * @Desciption :
 */
public class WeixinUtil {


    /**
     * 发起post请求
     *
     * @param url
     * @param outStr
     * @return
     */
    public static String doPost(String url, String outStr) {
        JSONObject jsonObject = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        System.out.println("1");
        HttpPost httpPost = new HttpPost(url);
        System.out.println("2");
        String result = "";
        try {
            httpPost.setEntity(new StringEntity(outStr, "UTF-8"));
            System.out.println("3");
            HttpResponse response = httpClient.execute(httpPost);
            System.out.println("4");
            HttpEntity entity = response.getEntity();
            System.out.println("5");
            result = EntityUtils.toString(entity, "UTF-8");
            System.out.println(result);
           // jsonObject = JSONObject.fromObject(result);
           // System.out.println("7");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 发起get请求
     *
     * @param url
     * @return
     */
    public static JSONObject doGet(String url) {
        JSONObject jsonObject = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        try {
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity, "UTF-8");
            jsonObject = JSONObject.fromObject(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }


}
