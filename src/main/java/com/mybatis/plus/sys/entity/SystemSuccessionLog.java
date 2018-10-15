package com.mybatis.plus.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户上下班日志
 * </p>
 *
 * @author huran
 * @since 2018-10-15
 */
@Data
@Accessors(chain = true)
@TableName("SYSTEM_SUCCESSION_LOG")
public class SystemSuccessionLog   {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;

    /**
     * 部门
     */
    @TableField("DEPT")
    private String dept;

    /**
     * 姓名
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * 上班时间
     */
    @TableField("GO_WORK_DATE")
    private LocalDateTime goWorkDate;

    /**
     * 下班时间
     */
    @TableField("AFTER_DATE")
    private LocalDateTime afterDate;

    /**
     * 上班状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 用户id
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 点击次数
     */
    @TableField("COUNT")
    private Integer count;

    /**
     * 当天
     */
    @TableField("CURRENT_DAY")
    private String currentDay;

    @TableField("DEPT_STRING")
    private String deptString;


}
