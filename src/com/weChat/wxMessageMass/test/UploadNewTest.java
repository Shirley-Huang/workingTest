package com.weChat.wxMessageMass.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/4
 * @Desciption :添加永久的图片素材
 */
public class UploadNewTest {

    public static void main(String[] args) throws Exception {
        //永久素材接口路径
        final String SET_PERMANENT_MATERIAL = "https://api.weixin.qq.com/cgi-bin/material/add_material?access_token=";
        //String SET_PERMANENT_MATERIAL = "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=";
//调用接口凭证
        String ACCESS_TOKEN = "17_1EWc2TwLdAr_AIBwFnG_hUselJ4x2GvaZxuN72byY4uiz-0UtSnBfRBJxbHK2F5mSVGs1o_jTzmv_mvqDkxi7xEPScHs9lWDiCB_iiuN3tHCTZXhod78eNCkrERkSdCKhenk7BLVYSr6-t3ZQZYgAFAMVU";

        HttpURLConnection huct = (HttpURLConnection) new URL(SET_PERMANENT_MATERIAL + ACCESS_TOKEN + "&type=thumb").openConnection();
        huct.setRequestMethod("POST");//注意，只能以POST方式上传文件
        huct.setDoOutput(true);//设置可以有返回值

        File file = new File("D:\\Other\\图片\\image\\6.jpg");

        huct.setRequestProperty("Content-Type", "multipart/form-data; boundary=-------------------146043902153");
        OutputStream os = huct.getOutputStream();
        StringBuilder strb = new StringBuilder();
//设置头部分割符
        strb.append("\r\n---------------------146043902153\r\n");
        strb.append("Content-Disposition:form-data;name=\"media\";");
        strb.append("filename=\"" + file.getName() + "\";");//图片名称
        strb.append("Content-Type:\"video\";encoding=utf-8;");//video媒体文件类型和设置编码格式
        strb.append("filelength:\"" + file.length() + "\"\r\n");//文件大小
        strb.append("application/octet-stream\r\n\r\n");
        os.write(strb.toString().getBytes("UTF-8"));

        FileInputStream fis = new FileInputStream(file);
        byte[] bt = new byte[fis.available()];
        fis.read(bt);
        fis.close();
        os.write(bt);

        String perpetual = "";//创建永久视频素材时，要额外添加表单数据
        perpetual += "\r\n---------------------146043902153\r\n";
        perpetual += "Content-Disposition:form-data;name=\"description\";\r\n\r\n";
        perpetual += ("{\"title\":\"视频素材的标题\",\"introduction\":\"视频素材的描述\"}");
        os.write(perpetual.getBytes("UTF-8"));

//尾部分割符
        os.write("\r\n---------------------146043902153--\r\n\r\n".getBytes());
        os.flush();
        os.close();

        InputStream is = huct.getInputStream();
        byte[] by = new byte[is.available()];
        is.read(by);
        System.out.println(new String(by));//返回数据

    }


}
