package com.igeek.egobuy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.igeek.egobuy.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}