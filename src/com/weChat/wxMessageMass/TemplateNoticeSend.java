package com.weChat.wxMessageMass;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/29
 * @Desciption :
 */
public class TemplateNoticeSend {

    private String ACCESS_TOKEN = "";


    @Test
    public void testSend(){

        /**
         * 文本
         * {
         *    "touser":[
         *     "OPENID1",
         *     "OPENID2"
         *    ],
         *     "msgtype": "text",
         *     "text": { "content": "hello from boxer."}
         * }
         */

        /**
         * 返回数据
         * {
         *    "errcode":0,
         *    "errmsg":"send job submission success",
         *    "msg_id":34182,
         *    "msg_data_id": 206227730
         * }
         */

        String testUrl = "https://api.weixin.qq.com/cgi-bin/message/mass/preview?access_token="+ACCESS_TOKEN;

        String onlineUrl = "https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token="+ACCESS_TOKEN;




        Map<String, String> data = new HashMap<String, String>();
        data.put("touser","[\n" + "    \"OPENID1\",\n" + "    \"OPENID2\"\n" + "   ]");
        data.put("msgtype","text");
        data.put("text","{ \"content\": \"hello from boxer.\"}");








    }



    /**
     * 根据OpenId进行群发文本消息
     * @param accessToken  授权token
     * @param openids  openid
     * @param content
     * @return
     */
    /*public MassMsgResult sendTextToOpenid(String accessToken, List<String> openids, String content){
        MassMsgResult result = null;
        TreeMap<String, String> params = new TreeMap<String, String>();
        params.put("access_token", accessToken);
        // post 提交的参数
        Map<String, Object> textParams = new HashMap<String, Object>();
        textParams.put("content", content);
        TreeMap<String,Object> dataParams = new TreeMap<String,Object>();
        dataParams.put("touser", openids);
        dataParams.put("text", textParams);
        dataParams.put("msgtype", "text");
        String data = JsonUtil.toJsonString(dataParams);
        System.out.println(data);
        String json = HttpReqUtil.HttpsDefaultExecute(SystemConfig.POST_METHOD, WechatConfig.SEND_MASS_MESSAGE_URL, params, data);
        try {
            result = JsonUtil.fromJsonString(json, MassMsgResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }*/



}
