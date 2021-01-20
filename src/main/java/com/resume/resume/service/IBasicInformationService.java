package com.resume.resume.service;

import com.resume.resume.entity.BasicInformation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* <p>
    *  服务类
    * </p>
*
* @author 康东伟
* @since 2021-01-20
*/
public interface IBasicInformationService extends IService<BasicInformation> {

    void addBasicInformation(BasicInformation dto);

    void updateBasicInformation(BasicInformation dto );

    void deleteBasicInformation(Long id);

}
