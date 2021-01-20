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
@TableName("resume_basic_information")
@ApiModel(value="BasicInformation对象")
public class BasicInformation implements Serializable {
private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "基本信息主键")
    @TableId(value = "information_id", type = IdType.AUTO)
    private Long informationId;
    @ApiModelProperty(value = "姓名")
    private String informationName;
    @ApiModelProperty(value = "性别")
    private Boolean informationSex;
    @ApiModelProperty(value = "职位")
    private String informationPosition;
    @ApiModelProperty(value = "邮箱")
    private String informationEmail;
    @ApiModelProperty(value = "手机号")
    private String informationPhone;
    @ApiModelProperty(value = "生日")
    private LocalDate informationBirthday;
    @ApiModelProperty(value = "参加工作时间")
    private LocalDate informationToWork;
    @ApiModelProperty(value = "证件照")
    private String informationPhoto;
    @ApiModelProperty(value = "删除标识")
    private String delFlag;
}