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
        update(new UpdateWrapper<ProjectExperience>()
                .set(dto.getProjectDemonstrateAddress()!=null&&!dto.getProjectDemonstrateAddress().equals(""),"project_demonstrate_address",dto.getProjectDemonstrateAddress())
                .set(dto.getProjectName()!=null&&!dto.getProjectName().equals(""),"project_name",dto.getProjectName())
                .set(dto.getProjectDescription()!=null&&!dto.getProjectDescription().equals(""),"project_description",dto.getProjectDescription())
                .set(dto.getProjectRemark()!=null&&!dto.getProjectRemark().equals(""),"project_remark",dto.getProjectRemark())
                .set(dto.getProjectRole()!=null&&!dto.getProjectRole().equals(""),"project_role",dto.getProjectRole())
                .set(dto.getProjectStartTime()!=null&&!dto.getProjectStartTime().equals(""),"project_start_time",dto.getProjectStartTime())
                .set(dto.getProjectEndTime()!=null&&!dto.getProjectEndTime().equals(""),"project_end_time",dto.getProjectEndTime())
                .eq("project_id",dto.getProjectId())
        );
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteProjectExperience(ProjectExperience dto) {
        remove(new QueryWrapper<ProjectExperience>());
    }
}
