package com.igeek.egobuy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.igeek.egobuy.pojo.ItemCat;
import com.igeek.egobuy.mapper.ItemCatMapper;
import com.igeek.egobuy.service.ItemCatService;
@Service
public class ItemCatServiceImpl extends ServiceImpl<ItemCatMapper, ItemCat> implements ItemCatService{

}
