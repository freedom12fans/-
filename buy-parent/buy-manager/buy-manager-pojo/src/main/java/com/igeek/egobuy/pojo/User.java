package com.igeek.egobuy.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
    * 用户表
    */
@ApiModel(value="com-igeek-egobuy-pojo-User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user")
public class User implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    @ApiModelProperty(value="用户名")
    @NotNull(message = "用户名不能为空")
    private String username;

    /**
     * 密码，加密存储
     */
    @TableField(value = "password")
    @ApiModelProperty(value="密码，加密存储")
    private String password;

    /**
     * 注册手机号
     */
    @TableField(value = "phone")
    @ApiModelProperty(value="注册手机号")
    private String phone;

    /**
     * 注册邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="注册邮箱")
    private String email;

    @TableField(value = "created",fill = FieldFill.INSERT)
    @ApiModelProperty(value="")
    private Date created;

    @TableField(value = "updated",fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value="")
    private Date updated;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_PHONE = "phone";

    public static final String COL_EMAIL = "email";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}