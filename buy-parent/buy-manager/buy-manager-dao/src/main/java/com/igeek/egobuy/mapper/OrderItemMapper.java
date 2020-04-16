package com.igeek.egobuy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.igeek.egobuy.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
}