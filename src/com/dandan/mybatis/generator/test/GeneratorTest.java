package com.dandan.mybatis.generator.test;

import org.apache.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/23
 * @Desciption :自动根据表结构生成mapper映射文件、mapper接口i和pojo类
 */
public class GeneratorTest {


    Logger log = Logger.getLogger(this.getClass());

    public static void generatorTest() throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception{
        try{
            generatorTest();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
