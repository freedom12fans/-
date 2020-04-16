package com.igeek.egobuy.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.igeek.egobuy.pojo.Content;
import com.igeek.egobuy.mapper.ContentMapper;
import com.igeek.egobuy.service.ContentService;
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements ContentService{

}
