package com.resume.resume.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("resume_social_homepage")
@ApiModel(value="SocialHomepage对象")
public class SocialHomepage implements Serializable {
private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "社交主页id")
    @TableId(value = "social_id",type = IdType.AUTO)
    private Integer socialId;
    @ApiModelProperty(value = "QQ号")
    private String socialQq;
    @ApiModelProperty(value = "微信号")
    private String socialWechat;
    @ApiModelProperty(value = "github账号")
    private String socialGithub;
    @ApiModelProperty(value = "其他社交账号")
    private String socialOther;
    @ApiModelProperty(value = "人员id")
    private Long informationId;

}