package com.resume.resume.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("resume_expect")
@ApiModel(value="Expect对象")
public class Expect implements Serializable {
private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "职位期望主键")
    @TableId(value = "expect_id", type = IdType.AUTO)
    private Integer expectId;
    @ApiModelProperty(value = "期望职位")
    private String expectPosition;
    @ApiModelProperty(value = "期望工作地址")
    private String expectAddress;
    @ApiModelProperty(value = "期望薪资")
    private BigDecimal expectSalary;
    @ApiModelProperty(value = "求职类型( 0 兼职  1  全职 )")
    private Boolean expectType;
    @ApiModelProperty(value = "期望备注")
    private String expectRemark;
    @ApiModelProperty(value = "人员id")
    private Long informationId;

}