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

@ApiModel(value="com-igeek-egobuy-pojo-Content")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_content")
public class Content implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 内容类目ID
     */
    @TableField(value = "category_id")
    @ApiModelProperty(value="内容类目ID")
    private Long categoryId;

    /**
     * 内容标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="内容标题")
    private String title;

    /**
     * 子标题
     */
    @TableField(value = "sub_title")
    @ApiModelProperty(value="子标题")
    private String subTitle;

    /**
     * 标题描述
     */
    @TableField(value = "title_desc")
    @ApiModelProperty(value="标题描述")
    private String titleDesc;

    /**
     * 链接
     */
    @TableField(value = "url")
    @ApiModelProperty(value="链接")
    private String url;

    /**
     * 图片绝对路径
     */
    @TableField(value = "pic")
    @ApiModelProperty(value="图片绝对路径")
    private String pic;

    /**
     * 图片2
     */
    @TableField(value = "pic2")
    @ApiModelProperty(value="图片2")
    private String pic2;

    /**
     * 内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="内容")
    private String content;

    @TableField(value = "created")
    @ApiModelProperty(value="")
    private Date created;

    @TableField(value = "updated")
    @ApiModelProperty(value="")
    private Date updated;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CATEGORY_ID = "category_id";

    public static final String COL_TITLE = "title";

    public static final String COL_SUB_TITLE = "sub_title";

    public static final String COL_TITLE_DESC = "title_desc";

    public static final String COL_URL = "url";

    public static final String COL_PIC = "pic";

    public static final String COL_PIC2 = "pic2";

    public static final String COL_CONTENT = "content";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}