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
@TableName("resume_project_experience")
@ApiModel(value="项目经历实体对象")
public class ProjectExperience implements Serializable {
private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "项目经历主键")
    @TableId(value = "project_id", type = IdType.AUTO)
    private Integer projectId;
    @ApiModelProperty(value = "项目名称")
    private String projectName;
    @ApiModelProperty(value = "担任角色")
    private String projectRole;
    @ApiModelProperty(value = "项目开始时间")
    private LocalDate projectStartTime;
    @ApiModelProperty(value = "项目结束时间")
    private LocalDate projectEndTime;
    @ApiModelProperty(value = "项目描述")
    private String projectDescription;
    @ApiModelProperty(value = "项目演示地址")
    private String projectDemonstrateAddress;
    @ApiModelProperty(value = "项目备注")
    private String projectRemark;
    @ApiModelProperty(value = "人员id")
    private Long informationId;

}