package com.igeek.egobuy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.igeek.egobuy.pojo.OrderShipping;
import com.igeek.egobuy.mapper.OrderShippingMapper;
import com.igeek.egobuy.service.OrderShippingService;
@Service
public class OrderShippingServiceImpl extends ServiceImpl<OrderShippingMapper, OrderShipping> implements OrderShippingService{

}
