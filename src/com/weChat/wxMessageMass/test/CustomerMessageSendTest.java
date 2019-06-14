package com.weChat.wxMessageMass.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.weChat.wxMessageMass.WeixinUtil;
import com.weChat.wxMessageMass.api.SendMessage;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/3
 * @Desciption :
 */
public class CustomerMessageSendTest {

    public static final String URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";

    //online token
    public String token = "";

    //test02 token
    public String token2 = "17_CAj0NdzuVCIAmuLS9OuK8bD5VvQfqkt4GKdSvOJgzMm38sC1-rp8bCdIFyUytKgVQEnY9oD_Iy8Eexm4ULtDPlPvL3mC6OJMoJ9Rj-8hqzxHpLbuIWirIUFaS44NUt4UVSoFLb5W4o8TZ7JlAFAcADAGLG";

    //消息内容
    public String content = "文本消息<a href='http://www.baidu.com'>打开百度</a>";

    @Test
    public void sendTest(){

        //String url = URL.replace("ACCESS_TOKEN",token);
        String url = URL.replace("ACCESS_TOKEN",token2);

        Map<String,Object> textContent = new HashMap<String, Object>();
        textContent.put("content",content);

        //接收消息的openIds
        String touser = "oq6ff0iO69_H1D504rWSEWYYc208";

        SendMessage message = new SendMessage();
        message.setTouser(touser);
        message.setMsgtype("text");
        message.setText(textContent);

        //将测试消息对象转成json
        //String jsonTestMessage = JSONObject.toJSONString(testMessage);

        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String str = gson.toJson(message);
        System.out.println(str);

        String jsonObject = WeixinUtil.doPost(url, str);
        System.out.println(jsonObject);

    }

    public void customerServiceTest(){
        //添加客服接口
        String URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token2);

        Map<String,Object> textContent = new HashMap<String, Object>();
        textContent.put("kf_account","");
    }



}
