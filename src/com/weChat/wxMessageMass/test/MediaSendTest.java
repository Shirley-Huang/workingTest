package com.weChat.wxMessageMass.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.utils.ImportExcelUtils;
import com.weChat.wxMessageMass.WeixinUtil;
import com.weChat.wxMessageMass.api.Article;
import com.weChat.wxMessageMass.api.MassMessage;
import com.weChat.wxMessageMass.api.MediaMessage;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/4
 * @Desciption :
 */
public class MediaSendTest {

    //online token
    public static String token = "";

    //test02 token
    public static String token2 = "17_1EWc2TwLdAr_AIBwFnG_hUselJ4x2GvaZxuN72byY4uiz-0UtSnBfRBJxbHK2F5mSVGs1o_jTzmv_mvqDkxi7xEPScHs9lWDiCB_iiuN3tHCTZXhod78eNCkrERkSdCKhenk7BLVYSr6-t3ZQZYgAFAMVU";


    //上传图文消息内的图片获取URL

    /**
     * 群发图文消息
     */
    @Test
    public void sendNewsMessage(){
        //String URL = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
        String URL = "https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token2);

        //WeixinUtil.doPost(URL ,str);

        List<List<String>> lists =
                ImportExcelUtils.readExcel("F:\\WorkRecoding\\Script\\2019年\\群发消息客户openIds\\test02_customer_openIds.xlsx");

        List<String> touser = new ArrayList<String>();
        for (List<String> list : lists) {
            touser.add(list.get(0));
        }

        //图文消息的media_id
        String mediaId = "VK7lpdnGZwbxgjD_n9aX5EDt57oxo5a3xdI2tv1IeZw";
        //mediaId = getMediaId();

        Map<String,Object> mediaNews = new HashMap<String, Object>();
        mediaNews.put("media_id",mediaId);

        MassMessage message = new MassMessage();
        message.setTouser(touser);
        message.setMsgtype("mpnews");
        message.setMpnews(mediaNews);
        message.setSend_ignore_reprint(0);

        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String str = gson.toJson(message);
        System.out.println(str);

        String res = WeixinUtil.doPost(url, str);
        System.out.println(res);//msg_id":3147483652,"msg_data_id":2247483683}  "msg_id":3147483653,"msg_data_id":2247483684}

    }

    /**
     * 添加图文消息
     */
    @Test
    public void addNewsMaterial(){

        //String thumb_media_id = "VK7lpdnGZwbxgjD_n9aX5I1JhkOAmTTU_Dw6kii3dlg";
        String thumb_media_id = "VK7lpdnGZwbxgjD_n9aX5BT_bj1uqgDMfsYpC-zc2uM";

        List<Article> articles = new ArrayList<Article>();
        Article article1 = new Article();
        article1.setAuthor("黄丹丹");
        article1.setTitle("群发图文消息。。。");
        article1.setThumb_media_id(thumb_media_id);
        article1.setContent("简直要命，人生只有经历才会懂得，只有懂得才知道珍惜");
        article1.setContent("http://www.baidu.com");
        //article1.setShow_cover_pic(1);
        //article1.setDigest("digest");
        article1.setNeed_open_comment(0);
        article1.setOnly_fans_can_comment(0);

        articles.add(article1);

        TreeMap<String, Object> date = new TreeMap<String, Object>();
        date.put("articles",articles);

        String URL = "https://api.weixin.qq.com/cgi-bin/material/add_news?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token2);
        System.out.println(url);

        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String str = gson.toJson(date);
        System.out.println(str);

        String result = WeixinUtil.doPost(url, str);
        System.out.println(result);//VK7lpdnGZwbxgjD_n9aX5Apt0h_IIawb2z6awI2yFvM
        //VK7lpdnGZwbxgjD_n9aX5LaW-DGkeypZVu0S31wcKds   VK7lpdnGZwbxgjD_n9aX5A5DiunKilfZ_oXAz8urQd8


    }


    @Test
    public void getMediaImgURLTest(){

        String URL = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token2);

        MediaMessage mediaMessage = new MediaMessage();
        mediaMessage.setMedia("o69B-lsFS794EC75oGP6l12UGpIHdz_c3q66TZ5ZxpwhiuOotaRFygN7owAizAko");

        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String str = gson.toJson(mediaMessage);
        System.out.println(str);
        System.out.println(URL);

        WeixinUtil.doPost(url,str);
    }


    /**
     * 查看指定素材类型列表
     */
    @Test
    public void getMaterialsNews(){
        String URL = "https://api.weixin.qq.com/cgi-bin/material/batchget_material?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token2);
        System.out.println(url);

        LinkedHashMap<String,Object> data = new LinkedHashMap<String, Object>();
        data.put("type","news");
        data.put("offset",0);
        data.put("count",10);

        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String str = gson.toJson(data);
        System.out.println(str);

        String result = WeixinUtil.doPost(url, str);
        System.out.println(result);

    }

    /**
     * 获取素材管理统计
     */
    @Test
    public void getMaterialsCount() {
        String URL = "https://api.weixin.qq.com/cgi-bin/material/get_materialcount?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN", token2);

        WeixinUtil.doPost(url,"");
    }


    /**
     * 获取media id
     */

    @Test
    public void uploadTempMedia(){


        String Url = "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";
        String urlstr = Url.replace("ACCESS_TOKEN",token2).replace("TYPE","thumb");
        System.out.println(urlstr);

        URL mediaUrl;
        try {
            String boundary = "----WebKitFormBoundaryOYXo8heIv9pgpGjT";
            URL url = new URL(urlstr);
            HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
            //让输入输出流开启
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            //使用post方式请求的时候必须关闭缓存
            urlConn.setUseCaches(false);
            //设置请求头的Content-Type属性
            urlConn.setRequestProperty("Content-Type", "multipart/form-data; boundary="+boundary);
            urlConn.setRequestMethod("POST");
            //获取输出流，使用输出流拼接请求体
            OutputStream out = urlConn.getOutputStream();

            //读取文件的数据,构建一个GET请求，然后读取指定地址中的数据
            String mediaFileUrl = "http://pic33.photophoto.cn/20141022/0019032438899352_b.jpg";
            //String mediaFileUrl = "D:\\Other\\图片\\动漫\\2k.jpg";
            mediaUrl = new URL(mediaFileUrl);
            HttpURLConnection mediaConn = (HttpURLConnection)mediaUrl.openConnection();
            //设置请求方式
            mediaConn.setRequestMethod("GET");
            //设置可以打开输入流
            mediaConn.setDoInput(true);
            //获取传输的数据类型
            String contentType = mediaConn.getHeaderField("Content-Type");
            //将获取大到的类型转换成扩展名
            String fileExt = judgeType(contentType);
            //获取输入流，从mediaURL里面读取数据
            InputStream in = mediaConn.getInputStream();
            BufferedInputStream bufferedIn = new BufferedInputStream(in);
            //数据读取到这个数组里面
            byte[] bytes = new byte[1024];
            int size = 0;
            //使用outputStream流输出信息到请求体当中去
            out.write(("--"+boundary+"\r\n").getBytes());
            out.write(("Content-Disposition: form-data; name=\"media\";\r\n"
                    + "filename=\""+(new Date().getTime())+fileExt+"\"\r\n"
                    + "Content-Type: "+contentType+"\r\n\r\n").getBytes());
            while( (size = bufferedIn.read(bytes)) != -1) {
                out.write(bytes, 0, size);
            }
            //切记，这里的换行符不能少，否则将会报41005错误
            out.write(("\r\n--"+boundary+"--\r\n").getBytes());

            bufferedIn.close();
            in.close();
            mediaConn.disconnect();

            InputStream resultIn = urlConn.getInputStream();
            InputStreamReader reader = new InputStreamReader(resultIn);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String tempStr = null;
            StringBuffer resultStr = new StringBuffer();
            while((tempStr = bufferedReader.readLine()) != null) {
                resultStr.append(tempStr);
            }
            System.out.println(resultStr);
            bufferedReader.close();
            reader.close();
            resultIn.close();
            urlConn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * 通过传过来的contentType判断是哪一种类型
     * @param contentType 获取来自连接的contentType
     * @return
     */
    public static String judgeType(String contentType) {
        String fileExt = "";
        if("image/jpeg".equals(contentType)) {
            fileExt = ".jpg";
        } else if("audio/mpeg".equals(contentType)) {
            fileExt = ".mp3";
        } else if("audio/amr".equals(contentType)) {
            fileExt = ".amr";
        } else if("video/mp4".equals(contentType)) {
            fileExt = ".mp4";
        } else if("video/mpeg4".equals(contentType)) {
            fileExt = ".mp4";
        }
        return fileExt;
    }


}
