package com.resume.resume.service;

import com.resume.resume.entity.EducationExperience;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* <p>
    *  服务类
    * </p>
*
* @author 康东伟
* @since 2021-01-20
*/
public interface IEducationExperienceService extends IService<EducationExperience> {

    void addEducationExperience(EducationExperience dto);

    void updateEducationExperience(EducationExperience dto );

    void deleteEducationExperience(EducationExperience dto);

}
