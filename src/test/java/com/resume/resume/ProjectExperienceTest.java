package com.resume.resume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resume.resume.entity.ProjectExperience;
import com.resume.resume.service.IProjectExperienceService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ProjectExperienceTest {

    @Autowired
    private IProjectExperienceService service;

    @Test
    public void testAddProjectExperience(){
        ProjectExperience experience = new ProjectExperience();
        experience.setProjectName("融丰小贷交互安全中间系统");
        experience.setProjectDescription("用于外围系统与业务系统交互安全校验系统");
        experience.setProjectDemonstrateAddress("内网项目");
        experience.setProjectStartTime(LocalDate.of(2018,03,01));
        experience.setProjectEndTime(LocalDate.of(2018,07,01));
        experience.setProjectRemark("用于外围与业务系统交互的验证，参数安全过滤，参数解密并发送，参数加密返回\n" +
                "后台管理架构 springboot + mybatis-plus + RestTemplate + mysql + AES加密 + Validation验证框架 +Spring Security，\n" +
                "负责项目整体架构设计，模块开发，项目上线部署测试\n" +
                "对上线之后的系统进行维护调优");
        experience.setProjectRole("架构设计，java开发");
        experience.setInformationId(1l);
        service.addProjectExperience(experience);
    }

    @Test
    public void testUpdateProjectExperience(){

        ProjectExperience experience = new ProjectExperience();
        experience.setProjectName("呼和浩特市移动项目");
        experience.setProjectDescription("对移动项目根据甲方需求进行开发");
        experience.setProjectDemonstrateAddress("营业厅项目");
        experience.setProjectStartTime(LocalDate.now());
        experience.setProjectEndTime(LocalDate.now());
        experience.setProjectRemark("项目架构 spring+springMVC+mybatis <br/> 前端技术 html+js+css freemarker");
        experience.setProjectRole("项目架构设计，java代码开发维护");
        experience.setProjectId(1);
        service.updateProjectExperience(experience);
    }

    @Test
    public void testGetProjectExperience(){
        List<ProjectExperience> list = service.list(new QueryWrapper<ProjectExperience>().eq("information_id", 1l).orderByAsc("project_start_time"));
        list.forEach(System.out::println);
    }
}