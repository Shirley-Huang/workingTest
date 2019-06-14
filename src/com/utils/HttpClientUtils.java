package com.utils;

import sun.net.www.protocol.http.HttpURLConnection;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/8
 * @Desciption :
 */
public class HttpClientUtils {

    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final int DEFAULT_MAX_CON_TIMEOUT = 30000;
    private static final int DEFAULT_MAX_READ_TIMEOUT = 30000;
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";


    public static String post(String urlPath, Map params, String method) throws Exception{

        HttpURLConnection connection = null;
        BufferedReader reader = null;
        String responseStr = null;
        try{
            StringBuffer sb = new StringBuffer();
            if(method == null || method.equals("GET")){
                urlPath = urlPath + "?" + urlencode(params);
            }

            URL url = new URL(urlPath);

            connection = (HttpURLConnection) url.openConnection();

            if(method == null || method.equals("GET")){
                connection.setRequestMethod("GET");
            }else{
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
            }

            connection.setRequestProperty("User-agent", USER_AGENT);
            connection.setUseCaches(false);
            connection.setConnectTimeout(DEFAULT_MAX_CON_TIMEOUT);
            connection.setReadTimeout(DEFAULT_MAX_READ_TIMEOUT);
            connection.setInstanceFollowRedirects(false);

            connection.connect();

            if(params != null && method.equals("POST")){
                try{
                    OutputStream os = connection.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    dos.writeBytes(urlencode(params));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEFAULT_CHARSET));
            String strRead= null;
            while ((strRead = reader.readLine()) != null){
                sb.append(strRead);
            }
            responseStr = sb.toString();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(reader != null){
                reader.close();
            }
            if(connection != null){
                connection.disconnect();
            }
        }

        return responseStr;
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

}
