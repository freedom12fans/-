package com.igeek.egobuy.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        /*
        * 第一个参数  表的元数据   metaObject
        * 第二个参数  数据库的字段
        * 第三个参数  需要给字段的值的类
        * 第四个参数  需要给字段的具体的值
        * */
        this.strictInsertFill(metaObject, "created", Date.class, new Date()); // 起始版本 3.3.0(推荐使用)
        this.strictInsertFill(metaObject, "updated", Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updated", Date.class, new Date()); // 起始版本 3.3.0(推荐使用)

    }
}
