package com.resume.resume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resume.resume.entity.WorkExperience;
import com.resume.resume.service.IWorkExperienceService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class WorkExperienceTest {

    @Autowired
    private IWorkExperienceService service;

    @Test
    public void testAddWorkExperience(){
        WorkExperience workExperience = new WorkExperience();
        workExperience.setExperienceCompanyName("内蒙古融丰小额贷款有限公司");
        workExperience.setExperienceDepartment("IT部门");
        workExperience.setExperienceIndustry("互联网/金融/信贷");
        workExperience.setExperiencePosition("系统研发工程师");
        workExperience.setExperienceWorkContent("负责公司信贷系统及外围系统（小程序，公众号，汇客系统，二代征信前置系统，交互安全中间系统）的开发与维护，对业务需求进行分析，设计系统架构" +
                "及开发代码规范定制，针对模块进行开发，项目上线环境搭建及配置，维护等...");
        workExperience.setExperienceWorkEndDate(LocalDate.of(2018,07,10));
        workExperience.setExperienceWorkStartDate(LocalDate.of(2021,03,11));
        workExperience.setInformationId(1l);
        service.addWorkExperience(workExperience);
    }

    @Test
    public void testUpdateWorkExperience(){
        WorkExperience workExperience = new WorkExperience();
        workExperience.setExperienceCompanyName("内蒙古祺梦科技有限责任公司");
//        workExperience.setExperienceDepartment("后台开发组");
//        workExperience.setExperienceIndustry("互联网/IT/电子/通信");
//        workExperience.setExperiencePosition("JAVA开发工程师");
//        workExperience.setExperienceWorkContent("负责公司系统的开发与维护，对业务需求进行分析，设计");
        workExperience.setExperienceWorkEndDate(LocalDate.of(2018,07,05));
        workExperience.setExperienceWorkStartDate(LocalDate.of(2016,05,05));
        workExperience.setExperienceId(1);
        service.updateWorkExperience(workExperience);
    }

    @Test
    public void testGetWorkExperience(){
        List<WorkExperience> list = service.list(new QueryWrapper<WorkExperience>().eq("information_id", 1l));
        list.forEach(System.out::println);
    }
}