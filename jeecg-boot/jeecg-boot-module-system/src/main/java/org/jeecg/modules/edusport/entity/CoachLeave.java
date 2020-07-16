package org.jeecg.modules.edusport.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;

/**
 * @Description: 教练员请假信息表
 */
@Data
@TableName("tb_edu_coach_leave")
public class CoachLeave implements Serializable {
    private static final long serialVersionUID = 1L;

    /**主键id*/
    @TableId(type = IdType.ID_WORKER_STR)
    private java.lang.String id;
    /**教练员代码*/
    @Excel(name = "教练员id", width = 15)
    private java.lang.String coachId;
    /**请假原因*/
    @Excel(name = "请假原因", width = 15)
    private java.lang.String reason;
    /**开始日期*/
    @Excel(name = "开始日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.util.Date startDate;
    /**结束日期*/
    @Excel(name = "结束日期", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.util.Date endDate;
    /**单据类型*/
    @Excel(name = "单据类型", width = 15)
    private java.lang.String billType;
    /**创建人*/
    @Excel(name = "创建人", width = 15)
    private java.lang.String createBy;
    /**创建时间*/
    @Excel(name = "创建时间", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.util.Date createTime;
    /**更新人*/
    @Excel(name = "更新人", width = 15)
    private java.lang.String updateBy;
    /**更新时间*/
    @Excel(name = "更新时间", width = 15, format = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.util.Date updateTime;
    /**流程id*/
    @Excel(name = "流程id", width = 15)
    private java.lang.String workflowId;
    /**流程状态*/
    @Excel(name = "流程状态", width = 15)
    private java.lang.String workflowStatus;

}
