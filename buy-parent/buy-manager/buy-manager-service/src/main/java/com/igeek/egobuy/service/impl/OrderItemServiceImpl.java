package com.igeek.egobuy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.igeek.egobuy.pojo.OrderItem;
import com.igeek.egobuy.mapper.OrderItemMapper;
import com.igeek.egobuy.service.OrderItemService;
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService{

}
