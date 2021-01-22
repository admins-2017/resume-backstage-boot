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
        update(new UpdateWrapper<WorkExperience>()
            .set(dto.getExperienceCompanyName()!=null&&!dto.getExperienceCompanyName().equals(""),"experience_company_name",dto.getExperienceCompanyName())
            .set(dto.getExperienceDepartment()!=null&&!dto.getExperienceDepartment().equals(""),"experience_department",dto.getExperienceDepartment())
            .set(dto.getExperienceIndustry()!=null&&!dto.getExperienceIndustry().equals(""),"experience_industry",dto.getExperienceIndustry())
            .set(dto.getExperiencePosition()!=null&&!dto.getExperiencePosition().equals(""),"experience_position",dto.getExperiencePosition())
            .set(dto.getExperienceWorkContent()!=null&&!dto.getExperienceWorkContent().equals(""),"experience_work_content",dto.getExperienceWorkContent())
            .set(dto.getExperienceWorkStartDate()!=null&&!dto.getExperienceWorkStartDate().equals(""),"experience_work_start_date",dto.getExperienceWorkStartDate())
            .set(dto.getExperienceWorkEndDate()!=null&&!dto.getExperienceWorkEndDate().equals(""),"experience_work_end_date",dto.getExperienceWorkEndDate())
            .eq("experience_id",dto.getExperienceId())
        );
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteWorkExperience(WorkExperience dto) {
        remove(new QueryWrapper<WorkExperience>());
    }
}
