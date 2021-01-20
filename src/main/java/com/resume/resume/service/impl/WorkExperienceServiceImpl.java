package com.resume.resume.service.impl;

import com.resume.resume.entity.WorkExperience;
import com.resume.resume.mapper.WorkExperienceMapper;
import com.resume.resume.service.IWorkExperienceService;
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
public class WorkExperienceServiceImpl extends ServiceImpl<WorkExperienceMapper, WorkExperience> implements IWorkExperienceService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addWorkExperience(WorkExperience dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateWorkExperience(WorkExperience dto){
        update(new UpdateWrapper<WorkExperience>());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteWorkExperience(WorkExperience dto) {
        remove(new QueryWrapper<WorkExperience>());
    }
}
