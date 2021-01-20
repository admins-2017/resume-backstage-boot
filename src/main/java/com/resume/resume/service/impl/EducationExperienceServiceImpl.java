package com.resume.resume.service.impl;

import com.resume.resume.entity.EducationExperience;
import com.resume.resume.mapper.EducationExperienceMapper;
import com.resume.resume.service.IEducationExperienceService;
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
public class EducationExperienceServiceImpl extends ServiceImpl<EducationExperienceMapper, EducationExperience> implements IEducationExperienceService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addEducationExperience(EducationExperience dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateEducationExperience(EducationExperience dto){
        update(new UpdateWrapper<EducationExperience>());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteEducationExperience(EducationExperience dto) {
        remove(new QueryWrapper<EducationExperience>());
    }
}
