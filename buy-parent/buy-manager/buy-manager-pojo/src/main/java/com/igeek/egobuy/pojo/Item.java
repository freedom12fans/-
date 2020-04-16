package com.igeek.egobuy.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 商品表
    */
@ApiModel(value="com-igeek-egobuy-pojo-Item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_item")
public class Item implements Serializable {
    /**
     * 商品id，同时也是商品编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="商品id，同时也是商品编号")
    private Long id;

    /**
     * 商品标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="商品标题")
    private String title;

    /**
     * 商品卖点
     */
    @TableField(value = "sell_point")
    @ApiModelProperty(value="商品卖点")
    private String sellPoint;

    /**
     * 商品价格，单位为：分
     */
    @TableField(value = "price")
    @ApiModelProperty(value="商品价格，单位为：分")
    private Long price;

    /**
     * 库存数量
     */
    @TableField(value = "num")
    @ApiModelProperty(value="库存数量")
    private Integer num;

    /**
     * 商品条形码
     */
    @TableField(value = "barcode")
    @ApiModelProperty(value="商品条形码")
    private String barcode;

    /**
     * 商品图片
     */
    @TableField(value = "image")
    @ApiModelProperty(value="商品图片")
    private String image;

    /**
     * 所属类目，叶子类目
     */
    @TableField(value = "cid")
    @ApiModelProperty(value="所属类目，叶子类目")
    private Long cid;

    /**
     * 商品状态，1-正常，2-下架，3-删除
     */
    @TableField(value = "status")
    @ApiModelProperty(value="商品状态，1-正常，2-下架，3-删除")
    private Byte status;

    /**
     * 创建时间
     */

    @TableField(value = "created",fill = FieldFill.INSERT)
    @ApiModelProperty(value="创建时间")
    private Date created;

    /**
     * 更新时间
     */
    @TableField(value = "updated",fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value="更新时间")
    private Date updated;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_SELL_POINT = "sell_point";

    public static final String COL_PRICE = "price";

    public static final String COL_NUM = "num";

    public static final String COL_BARCODE = "barcode";

    public static final String COL_IMAGE = "image";

    public static final String COL_CID = "cid";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}