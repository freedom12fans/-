package com.igeek.egobuy.controller;

import com.igeek.egobuy.annotation.RecordSysLog;
import com.igeek.egobuy.pojo.Item;
import com.igeek.egobuy.service.ItemService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * tags  描述该controller
 * 设置tags以后  value就不显示了
 * */
@Api(tags = "商品列表模块")
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    //swagger 插件的
    @ApiOperation("根据id查询商品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    //给哪个参数进行描述
                    name = "id",
                    //对参数的描述
                    value = "商品id",
                    //必填
                    required = true,
                    //参数的来源
                    paramType = "path",
                    //参数类型
                    dataType = "int",
                    //默认值
                    defaultValue = "536563"
            )
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,message = "请求成功"
            ),
            @ApiResponse(
                    code = 500,message = "有异常"
            )
    })
    @RecordSysLog("根据id查询商品")
    @GetMapping("/find/{id}")
    public Item getItemById(@PathVariable Integer id){
        System.out.println("aaaaa");
        return itemService.getById(id);
    }
}
