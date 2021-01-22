package com.resume.resume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resume.resume.entity.EducationExperience;
import com.resume.resume.service.IEducationExperienceService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class EducationExperienceTest {

    @Autowired
    private IEducationExperienceService service;

    @Test
    public void testAddEducation(){
        EducationExperience experience = new EducationExperience();
        experience.setInformationId(1l);
        experience.setEducationHighestEducation("大专");
        experience.setEducationStartTime(LocalDate.now());
        experience.setEducationEndTime(LocalDate.now());
        experience.setEducationSchoolExperience("在校曾参加PLC编程比赛获得第三名，参与本院选课系统二次开发");
        experience.setEducationProfession("电气自动化");
        experience.setEducationSchool("内蒙古大学");

        service.addEducationExperience(experience);
    }

    @Test
    public void testUpdateEducation(){
        EducationExperience experience = new EducationExperience();
        experience.setInformationId(1l);
//        experience.setEducationHighestEducation("专科");
//        experience.setEducationStartTime(LocalDate.of(2013,9,1));
//        experience.setEducationEndTime(LocalDate.of(2016,6,1));
//        experience.setEducationSchoolExperience("在校曾参加PLC编程比赛获得第三名，参与本院选课系统二次开发");
        experience.setEducationProfession("电气自动化");
//        experience.setEducationSchool("内蒙古机电职业技术学院");

        service.updateEducationExperience(experience);
    }

    @Test
    public void testGetEducation(){
        EducationExperience information_id = service.getOne(new QueryWrapper<EducationExperience>().eq("information_id", 1l));
        log.info(information_id.toString());
    }
}