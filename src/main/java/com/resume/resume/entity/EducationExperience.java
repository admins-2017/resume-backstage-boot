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
@TableName("resume_education_experience")
@ApiModel(value="EducationExperience对象")
public class EducationExperience implements Serializable {
private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "教育经历id")
    @TableId(value = "education_id", type = IdType.AUTO)
    private Integer educationId;
    @ApiModelProperty(value = "毕业学校名称")
    private String educationSchool;
    @ApiModelProperty(value = "最高学历")
    private String educationHighestEducation;
    @ApiModelProperty(value = "专业")
    private String educationProfession;
    @ApiModelProperty(value = "入学时间")
    private LocalDate educationStartTime;
    @ApiModelProperty(value = "毕业时间")
    private LocalDate educationEndTime;
    @ApiModelProperty(value = "在校经历")
    private String educationSchoolExperience;
    @ApiModelProperty(value = "人员id")
    private Long informationId;

}