package com.igeek.egobuy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.igeek.egobuy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}