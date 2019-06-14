package com.weChat.wxMessageMass.api;

import java.util.List;
import java.util.Map;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/29
 * @Desciption :
 */
public class MassMessage{

    private List<String> touser;
    private Map<String,Object> mpnews;
    private String msgtype;
    private Map<String,Object> text ;
    private Integer send_ignore_reprint;

    public List<String> getTouser() {
        return touser;
    }

    public void setTouser(List<String> touser) {
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

    public Map<String, Object> getMpnews() {
        return mpnews;
    }

    public void setMpnews(Map<String, Object> mpnews) {
        this.mpnews = mpnews;
    }

    public Integer getSend_ignore_reprint() {
        return send_ignore_reprint;
    }

    public void setSend_ignore_reprint(Integer send_ignore_reprint) {
        this.send_ignore_reprint = send_ignore_reprint;
    }
}
