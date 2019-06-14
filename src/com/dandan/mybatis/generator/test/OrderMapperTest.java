package com.dandan.mybatis.generator.test;

import com.dandan.mybatis.generator.IMapper.OrderMapper;
import com.dandan.mybatis.generator.pojo.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/27
 * @Desciption :
 */
public class OrderMapperTest extends AbstractPersistenceTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void selectOrderTest(){
        Order order = orderMapper.selectByPrimaryKey("1034522");
        System.out.println("");
    }

}
