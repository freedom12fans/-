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
    * 商品规则参数
    */
@ApiModel(value="com-igeek-egobuy-pojo-ItemParam")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_item_param")
public class ItemParam implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 商品类目ID
     */
    @TableField(value = "item_cat_id")
    @ApiModelProperty(value="商品类目ID")
    private Long itemCatId;

    /**
     * 参数数据，格式为json格式
     */
    @TableField(value = "param_data")
    @ApiModelProperty(value="参数数据，格式为json格式")
    private String paramData;

    @TableField(value = "created")
    @ApiModelProperty(value="")
    private Date created;

    @TableField(value = "updated")
    @ApiModelProperty(value="")
    private Date updated;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ITEM_CAT_ID = "item_cat_id";

    public static final String COL_PARAM_DATA = "param_data";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}