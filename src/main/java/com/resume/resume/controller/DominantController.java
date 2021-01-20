package com.resume.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resume.resume.service.IDominantService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import com.resume.resume.entity.Dominant;

/**
* @author 康东伟
* @since 2021-01-20
*/
@RestController
@RequestMapping("/dominant")
public class DominantController {

    private final IDominantService service;

    public DominantController(IDominantService service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(Dominant dto){
        service.addDominant(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(Dominant dto){
        service.updateDominant(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(Dominant dto){
        service.deleteDominant(dto);
        return JSONResult.ok("删除完成");
    }

    @GetMapping
    public JSONResult getDominantByCondition(){
        return JSONResult.ok(service.list(new QueryWrapper<Dominant>()));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<Dominant>()));
    }
}
