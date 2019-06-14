package com.utils;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/1
 * @Desciption :
 */
public class ExcelDiffUtils {


   //@Test
    public static List<String> getDiff() throws Exception{

        Set<String> ps = getSet("F:\\WorkRecoding\\Script\\2019年\\群发消息客户openIds\\20190104_all_cutomer_openIds.txt");
        Set<String> ns = getSet("F:\\WorkRecoding\\Script\\2019年\\群发消息客户openIds\\20190111_all_cutomer_openIds.txt");

        ns.removeAll(ps);

        List<String> diffs = new ArrayList<String>();
        for (String s : ns) {
            //System.out.println(s);
            diffs.add(s);
        }
        return diffs;
    }

    public static void exportExcel(List<String> diffs) throws Exception{
        //OutputStream outputStream = new FilterOutputStream();
    }


    public static Set<String> getSet(String path) throws Exception{
        File file = new File(path);
        Set<String> set = new HashSet<String>();
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputreader);
        String line;
        while (( line = reader.readLine()) != null) {
            set.add(line.trim());
        }
        inputStream.close();
        return set;
    }






}
