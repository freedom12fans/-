package com.igeek.egobuy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.igeek.egobuy.mapper.ItemDescMapper;
import com.igeek.egobuy.pojo.ItemDesc;
import com.igeek.egobuy.service.ItemDescService;
@Service
public class ItemDescServiceImpl extends ServiceImpl<ItemDescMapper, ItemDesc> implements ItemDescService{

}
