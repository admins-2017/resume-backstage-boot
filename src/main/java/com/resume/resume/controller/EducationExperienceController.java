package com.resume.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resume.resume.service.IEducationExperienceService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import com.resume.resume.entity.EducationExperience;

/**
* @author 康东伟
* @since 2021-01-20
*/
@RestController
@RequestMapping("/resume/education-experience")
public class EducationExperienceController {

    private final IEducationExperienceService service;

    public EducationExperienceController(IEducationExperienceService service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(EducationExperience dto){
        service.addEducationExperience(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(EducationExperience dto){
        service.updateEducationExperience(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(EducationExperience dto){
        service.deleteEducationExperience(dto);
        return JSONResult.ok("删除完成");
    }

    @GetMapping("/{id}")
    public JSONResult getEducationExperienceByCondition(@PathVariable Long id){
        return JSONResult.ok(service.getOne(new QueryWrapper<EducationExperience>().eq("information_id", id)));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<EducationExperience>()));
    }
}
