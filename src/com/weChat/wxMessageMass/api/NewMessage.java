package com.weChat.wxMessageMass.api;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/4
 * @Desciption :
 */
public class NewMessage implements Serializable {

    private String toUserName;
    private String fromUserName;
    private long createTime;
    private String msgType;
    private String funcFlag;
    private List<Article> articleList;
}
