package com.igeek.egobuy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 商品描述表
    */
@ApiModel(value="com-igeek-egobuy-pojo-ItemDesc")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_item_desc")
public class ItemDesc implements Serializable {
    /**
     * 商品ID
     */
    @TableId(value = "item_id", type = IdType.INPUT)
    @ApiModelProperty(value="商品ID")
    private Long itemId;

    /**
     * 商品描述
     */
    @TableField(value = "item_desc")
    @ApiModelProperty(value="商品描述")
    private String itemDesc;

    /**
     * 创建时间
     */
    @TableField(value = "created")
    @ApiModelProperty(value="创建时间")
    private Date created;

    /**
     * 更新时间
     */
    @TableField(value = "updated")
    @ApiModelProperty(value="更新时间")
    private Date updated;

    private static final long serialVersionUID = 1L;

    public static final String COL_ITEM_ID = "item_id";

    public static final String COL_ITEM_DESC = "item_desc";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}