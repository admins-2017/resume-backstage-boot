package com.resume.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resume.resume.service.IWorkExperienceService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import com.resume.resume.entity.WorkExperience;

/**
* @author 康东伟
* @since 2021-01-20
*/
@RestController
@RequestMapping("/resume/work-experience")
public class WorkExperienceController {

    private final IWorkExperienceService service;

    public WorkExperienceController(IWorkExperienceService service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(WorkExperience dto){
        service.addWorkExperience(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(WorkExperience dto){
        service.updateWorkExperience(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(WorkExperience dto){
        service.deleteWorkExperience(dto);
        return JSONResult.ok("删除完成");
    }

    @GetMapping("/{id}")
    public JSONResult getWorkExperienceByCondition(@PathVariable Long id){
        return JSONResult.ok(service.list(new QueryWrapper<WorkExperience>().eq("information_id", id)));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<WorkExperience>()));
    }
}
