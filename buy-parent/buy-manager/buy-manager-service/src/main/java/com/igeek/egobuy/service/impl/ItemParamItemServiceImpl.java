package com.igeek.egobuy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.igeek.egobuy.mapper.ItemParamItemMapper;
import com.igeek.egobuy.pojo.ItemParamItem;
import com.igeek.egobuy.service.ItemParamItemService;
@Service
public class ItemParamItemServiceImpl extends ServiceImpl<ItemParamItemMapper, ItemParamItem> implements ItemParamItemService{

}
