package com.weChat.wxMessageMass.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.utils.ExcelDiffUtils;
import com.utils.ImportExcelUtils;
import com.weChat.wxMessageMass.WeixinUtil;
import com.weChat.wxMessageMass.api.MassMessage;
import org.junit.Test;

import java.util.*;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/12/29
 * @Desciption :群发消息
 */
public class MassMessageTest {

    //url
    public static final String URL = "https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=ACCESS_TOKEN";

    //获取token  --test02
    String token = "17_LtHIKGd3ezdmikeb8VvHlML-4_jjthCKj33mzHsqRqaV56nIGslAlok7OKRemM72rwRtIcBkgcv2h4_0qVb87Huph_plLYY1QaVIYMWsWLgY9-K2P2iCDv0EUz_nYe191x52B5Fh6Bn3HW7xLONdACASVU";

    //线上token
   // String token = "17_iaE2I-cSD8FHpueg_3DtAFpbgYS7PNEYj4DpNj_cHYq7xACpzLKrbXUTguJidwv3GG5yuL0Ha2qjZtlkclEbrS0DQ3EcpiO4ScCwYwG1hbacJW0pkpeWcrpRJ4Yq0CdhLh5Ls7Bm8lxA_rXWQQRjAAAGGH";

    /**
     * 群发文本消息
     */
    @Test
    public void testMassTextMessageSend() throws Exception {

        List<String> touser = new ArrayList<String>();//1220

       /*List<List<String> > lists = ImportExcelUtils.readExcel("C:\\Users\\79974\\Desktop\\20190101_all_cutomer_openIds.xlsx");
        List<List<String>> errorIdentity = new ArrayList<List<String>>();
        //行数据

        //全部客户群发
        for (List<String> list : lists) {
            //列数据
            touser.add(list.get(0));
        }*/

        //给新用户发送
        touser = ExcelDiffUtils.getDiff();
        System.out.println(touser.size());


        String url = URL.replace("ACCESS_TOKEN",token);

        //接收消息的openIds
        MassMessage massMessage = new MassMessage();



        //发送给客户的信息
        String content = "【红包来啦】您好！感谢您选择欧极佳智能锁和匠云科技的服务！前往小米有品按要求给出好评，即可获得30元现金红包奖励，详情请咨询有品商家客服。<a href='https://youpin.mi.com/detail?gid=104837'>立即评价>>></a>";
        //String content = "【红包来啦】元旦快乐！新年快乐！感谢您选择欧极佳智能锁和匠云科技的服务！前往小米有品按要求给出好评，即可获得30元现金红包奖励，详情请咨询有品商家客服。<a href='https://youpin.mi.com/detail?gid=104837'>立即评价>>></a>";



        Map<String,Object> textContent = new HashMap<String, Object>();
        textContent.put("content",content);

        massMessage.setTouser(touser);
        massMessage.setMsgtype("text");
        massMessage.setText(textContent);

        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String str = gson.toJson(massMessage);
        System.out.println(str);

        String jsonObject = WeixinUtil.doPost(url, str);
        System.out.println(jsonObject);

    }

    /**
     * 群发图文消息
     */
    @Test
    public void sendMassNewsMessage(){
        //String URL = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
        String URL = "https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token);

        //WeixinUtil.doPost(URL ,str);

        List<List<String>> lists =
                ImportExcelUtils.readExcel("F:\\WorkRecoding\\Script\\2019年\\群发消息客户openIds\\test02_customer_openIds.xlsx");

        List<String> touser = new ArrayList<String>();
        for (List<String> list : lists) {
            touser.add(list.get(0));
        }

        //图文消息的media_id TODO 获取图文消息的media_id
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
     * 查看群发的状态
     */
    @Test
    public void getMsgIdStatus(){

        String URL = "https://api.weixin.qq.com/cgi-bin/message/mass/get?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token);


        Map<String, String> data = new HashMap<String, String>();
        data.put("msg_id","3147483657");//3147483653 3147483654  3147483655 3147483656 3147483652 3147483653 3147483657

        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String str = gson.toJson(data);
        String jsonObject = WeixinUtil.doPost(url, str);



    }

    /**
     * 获取指定类型的素材列表
     */
    @Test
    public void getMaterialsList(){
        String URL = "https://api.weixin.qq.com/cgi-bin/material/batchget_material?access_token=ACCESS_TOKEN";
        String url = URL.replace("ACCESS_TOKEN",token);
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
        String url = URL.replace("ACCESS_TOKEN", token);

        WeixinUtil.doPost(url,"");
    }



}
