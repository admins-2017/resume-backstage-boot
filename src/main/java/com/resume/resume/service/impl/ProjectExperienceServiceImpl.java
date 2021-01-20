package com.resume.resume.service.impl;

import com.resume.resume.entity.ProjectExperience;
import com.resume.resume.mapper.ProjectExperienceMapper;
import com.resume.resume.service.IProjectExperienceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
/**
* @author 康东伟
* @since 2021-01-20
*/
@Service
public class ProjectExperienceServiceImpl extends ServiceImpl<ProjectExperienceMapper, ProjectExperience> implements IProjectExperienceService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addProjectExperience(ProjectExperience dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateProjectExperience(ProjectExperience dto){
        update(new UpdateWrapper<ProjectExperience>());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteProjectExperience(ProjectExperience dto) {
        remove(new QueryWrapper<ProjectExperience>());
    }
}
