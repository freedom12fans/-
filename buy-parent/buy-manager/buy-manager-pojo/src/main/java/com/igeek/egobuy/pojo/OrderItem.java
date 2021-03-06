package com.igeek.egobuy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-igeek-egobuy-pojo-OrderItem")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_order_item")
public class OrderItem implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private String id;

    /**
     * 商品id
     */
    @TableField(value = "item_id")
    @ApiModelProperty(value="商品id")
    private String itemId;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单id")
    private String orderId;

    /**
     * 商品购买数量
     */
    @TableField(value = "num")
    @ApiModelProperty(value="商品购买数量")
    private Integer num;

    /**
     * 商品标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="商品标题")
    private String title;

    /**
     * 商品单价
     */
    @TableField(value = "price")
    @ApiModelProperty(value="商品单价")
    private Long price;

    /**
     * 商品总金额
     */
    @TableField(value = "total_fee")
    @ApiModelProperty(value="商品总金额")
    private Long totalFee;

    /**
     * 商品图片地址
     */
    @TableField(value = "pic_path")
    @ApiModelProperty(value="商品图片地址")
    private String picPath;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ITEM_ID = "item_id";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_NUM = "num";

    public static final String COL_TITLE = "title";

    public static final String COL_PRICE = "price";

    public static final String COL_TOTAL_FEE = "total_fee";

    public static final String COL_PIC_PATH = "pic_path";
}