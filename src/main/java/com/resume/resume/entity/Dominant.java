package com.resume.resume.entity;

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
@TableName("resume_dominant")
@ApiModel(value="个人优势对象")
public class Dominant implements Serializable {
private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "个人优势id")
    @TableId(value = "dominant_id", type = IdType.AUTO)
    private Integer dominantId;
    @ApiModelProperty(value = "优势详情")
    private String dominantDetail;
    @ApiModelProperty(value = "人员id")
    private Long informationId;

}