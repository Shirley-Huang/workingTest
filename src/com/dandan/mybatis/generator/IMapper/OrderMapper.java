package com.dandan.mybatis.generator.IMapper;

import com.dandan.mybatis.generator.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(Order record);

    Order selectByPrimaryKey(@Param("id") String id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}