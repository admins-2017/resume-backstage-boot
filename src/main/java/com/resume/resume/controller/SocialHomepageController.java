package com.resume.resume.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resume.resume.service.ISocialHomepageService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import com.resume.resume.entity.SocialHomepage;

/**
* @author 康东伟
* @since 2021-01-20
*/
@RestController
@RequestMapping("/resume/social-homepage")
public class SocialHomepageController {

    private final ISocialHomepageService service;

    public SocialHomepageController(ISocialHomepageService service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(SocialHomepage dto){
        service.addSocialHomepage(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(SocialHomepage dto){
        service.updateSocialHomepage(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(SocialHomepage dto){
        service.deleteSocialHomepage(dto);
        return JSONResult.ok("删除完成");
    }

    @GetMapping("/{id}")
    public JSONResult getSocialHomepageByCondition(@PathVariable Long id){
        return JSONResult.ok(service.getOne(new QueryWrapper<SocialHomepage>().eq("information_id", id)));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<SocialHomepage>()));
    }
}
