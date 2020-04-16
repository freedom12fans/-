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
    * 内容分类
    */
@ApiModel(value="com-igeek-egobuy-pojo-ContentCategory")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_content_category")
public class ContentCategory implements Serializable {
    /**
     * 类目ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="类目ID")
    private Long id;

    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value="父类目ID=0时，代表的是一级的类目")
    private Long parentId;

    /**
     * 分类名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="分类名称")
    private String name;

    /**
     * 状态。可选值:1(正常),2(删除)
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态。可选值:1(正常),2(删除)")
    private Integer status;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    @TableField(value = "sort_order")
    @ApiModelProperty(value="排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数")
    private Integer sortOrder;

    /**
     * 该类目是否为父类目，1为true，0为false
     */
    @TableField(value = "is_parent")
    @ApiModelProperty(value="该类目是否为父类目，1为true，0为false")
    private Boolean isParent;

    /**
     * 创建时间
     */
    @TableField(value = "created")
    @ApiModelProperty(value="创建时间")
    private Date created;

    /**
     * 创建时间
     */
    @TableField(value = "updated")
    @ApiModelProperty(value="创建时间")
    private Date updated;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_NAME = "name";

    public static final String COL_STATUS = "status";

    public static final String COL_SORT_ORDER = "sort_order";

    public static final String COL_IS_PARENT = "is_parent";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}