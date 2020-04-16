package com.igeek.egobuy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.igeek.egobuy.pojo.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper extends BaseMapper<Item> {
}