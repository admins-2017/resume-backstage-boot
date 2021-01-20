package com.resume.resume.service;

import com.resume.resume.entity.ProjectExperience;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* <p>
    *  服务类
    * </p>
*
* @author 康东伟
* @since 2021-01-20
*/
public interface IProjectExperienceService extends IService<ProjectExperience> {

    void addProjectExperience(ProjectExperience dto);

    void updateProjectExperience(ProjectExperience dto );

    void deleteProjectExperience(ProjectExperience dto);

}
