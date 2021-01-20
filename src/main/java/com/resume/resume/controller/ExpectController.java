package com.resume.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resume.resume.service.IExpectService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import com.resume.resume.entity.Expect;

/**
* @author 康东伟
* @since 2021-01-20
*/
@RestController
@RequestMapping("/resume/expect")
public class ExpectController {

    private final IExpectService service;

    public ExpectController(IExpectService service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(Expect dto){
        service.addExpect(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(Expect dto){
        service.updateExpect(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(Expect dto){
        service.deleteExpect(dto);
        return JSONResult.ok("删除完成");
    }

    @GetMapping
    public JSONResult getExpectByCondition(){
        return JSONResult.ok(service.list(new QueryWrapper<Expect>()));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<Expect>()));
    }
}
