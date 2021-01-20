package com.resume.resume.service;

import com.resume.resume.entity.WorkExperience;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* <p>
    *  服务类
    * </p>
*
* @author 康东伟
* @since 2021-01-20
*/
public interface IWorkExperienceService extends IService<WorkExperience> {

    void addWorkExperience(WorkExperience dto);

    void updateWorkExperience(WorkExperience dto );

    void deleteWorkExperience(WorkExperience dto);

}
