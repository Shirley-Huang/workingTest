package com.own.test.classLoader;

import com.utils.ImportExcelUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/1/31
 * @Desciption :
 */
public class ArtisanInventorySearch {

    @Test
    public void search(){

        List<List<String>> lists = ImportExcelUtils.readExcel("C:\\Users\\79974\\Desktop\\artisan_inventory.xlsx");

        List<String> storageIds = new ArrayList<String>();
        for (int i = 0; i < lists.size() -2; i++) {
            //int i = 186;
            List<String> list = lists.get(i);
            System.out.println(i + "----" +list);
            String storageId = list.get(3);
            String toStorageId = list.get(5);
            String createdById = list.get(7);
            int b = i + 1;
            List<String> list2 = lists.get(b);
            String storageId2 = list2.get(3);
            String toStorageId2 = list2.get(5);
            String createdById2 = list2.get(7);

            if(!storageId.equals(storageId2)){
                //continue;
            }else{
                if(createdById.equals(createdById2) && !toStorageId.equals(toStorageId2)){
                    storageIds.add(storageId);
                }
            }

      }

        System.out.println("");


    }
}
