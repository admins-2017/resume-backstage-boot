package com.resume.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resume.resume.service.IBasicInformationService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import com.resume.resume.entity.BasicInformation;

/**
* @author 康东伟
* @since 2021-01-20
*/
@RestController
@RequestMapping("/resume/basic-information")
public class BasicInformationController {

    private final IBasicInformationService service;

    public BasicInformationController(IBasicInformationService service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(BasicInformation dto){
        service.addBasicInformation(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(BasicInformation dto){
        service.updateBasicInformation(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(Long id){
        service.deleteBasicInformation(id);
        return JSONResult.ok("删除完成");
    }

    @GetMapping("{id}")
    public JSONResult getBasicInformation(@PathVariable Long id){
        return JSONResult.ok(service.getOne(new QueryWrapper<BasicInformation>().eq("del_flag",1).eq("information_id",id)));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<BasicInformation>().eq("del_flag",1)));
    }
}
