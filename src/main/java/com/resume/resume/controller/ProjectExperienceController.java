package com.resume.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resume.resume.service.IProjectExperienceService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import com.resume.resume.entity.ProjectExperience;

/**
* @author 康东伟
* @since 2021-01-20
*/
@RestController
@RequestMapping("/resume/project-experience")
public class ProjectExperienceController {

    private final IProjectExperienceService service;

    public ProjectExperienceController(IProjectExperienceService service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(ProjectExperience dto){
        service.addProjectExperience(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(ProjectExperience dto){
        service.updateProjectExperience(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(ProjectExperience dto){
        service.deleteProjectExperience(dto);
        return JSONResult.ok("删除完成");
    }

    @GetMapping
    public JSONResult getProjectExperienceByCondition(){
        return JSONResult.ok(service.list(new QueryWrapper<ProjectExperience>()));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<ProjectExperience>()));
    }
}
