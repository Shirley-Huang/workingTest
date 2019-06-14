package com.weChat.wxMessageMass.api;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/3
 * @Desciption :
 */
public class SendMessage implements Serializable {

    //openId
    private String touser;
    //消息类型
    private String msgtype;
    //消息内容
    private Map<String, Object> text;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Map<String, Object> getText() {
        return text;
    }

    public void setText(Map<String, Object> text) {
        this.text = text;
    }
}
