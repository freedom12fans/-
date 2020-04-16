package com.igeek.egobuy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.igeek.egobuy.pojo.Item;
import com.igeek.egobuy.mapper.ItemMapper;
import com.igeek.egobuy.service.ItemService;
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService{

}
