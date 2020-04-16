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
    * 日志记录表
    */
@ApiModel(value="com-igeek-egobuy-pojo-SysLog")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_sys_log")
public class SysLog implements Serializable {
    /**
     * 日志id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="日志id")
    private Integer id;

    /**
     * 日志操作信息
     */
    @TableField(value = "userAction")
    @ApiModelProperty(value="日志操作信息")
    private String useraction;

    /**
     * 日志创建时间
     */
    @TableField(value = "createTime")
    @ApiModelProperty(value="日志创建时间")
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USERACTION = "userAction";

    public static final String COL_CREATETIME = "createTime";
}