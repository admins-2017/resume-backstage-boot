package com.resume.resume.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
* <p>
* 
* </p>
*
* @author 康东伟
* @since 2021-01-20
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("resume_work_experience")
@ApiModel(value="WorkExperience对象")
public class WorkExperience implements Serializable {
private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工作经历主键")
    @TableId(value = "experience_id", type = IdType.AUTO)
    private Integer experienceId;
    @ApiModelProperty(value = "公司名称")
    private String experienceCompanyName;
    @ApiModelProperty(value = "所属行业")
    private String experienceIndustry;
    @ApiModelProperty(value = "在职时间(开始时间)")
    private LocalDate experienceWorkStartDate;
    @ApiModelProperty(value = "在职时间(结束时间)")
    private LocalDate experienceWorkEndDate;
    @ApiModelProperty(value = "所在职位")
    private String experiencePosition;
    @ApiModelProperty(value = "工作内容")
    private String experienceWorkContent;
    @ApiModelProperty(value = "所在部门")
    private String experienceDepartment;
    @ApiModelProperty(value = "人员id")
    private Long informationId;

}