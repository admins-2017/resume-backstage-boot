package com.resume.resume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.resume.entity.BasicInformation;
import com.resume.resume.service.IBasicInformationService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;


@SpringBootTest
@Slf4j
class BasicInformationTest {

    @Autowired
    private IBasicInformationService service;

    @Test
    public void testAddInfo(){
        BasicInformation basicInformation = new BasicInformation();
        basicInformation.setInformationSex(false);
        basicInformation.setInformationBirthday(LocalDate.of(1995,2,11));
        basicInformation.setInformationEmail("604320844@qq.com");
        basicInformation.setInformationName("赵佳旺2");
        basicInformation.setInformationPhone("16621372652");
        basicInformation.setInformationPhoto("http://kangdongwei.cn/kangdongwei.jpeg");
        basicInformation.setInformationPosition("前端工程师");
        basicInformation.setInformationToWork(LocalDate.of(2017,6,20));
        service.addBasicInformation(basicInformation);
    }

    @Test
    public void testUpdateInfo(){

        BasicInformation basicInformation = new BasicInformation();
        basicInformation.setInformationSex(true);
//        basicInformation.setInformationBirthday(LocalDate.of(1995,2,11));
//        basicInformation.setInformationEmail("604320844@qq.com");
//        basicInformation.setInformationName("赵佳旺");
//        basicInformation.setInformationPhone("16621372652");
//        basicInformation.setInformationPhoto("http://kangdongwei.cn/kangdongwei.jpeg");
//        basicInformation.setInformationPosition("前端工程师");
//        basicInformation.setInformationToWork(LocalDate.of(2018,6,20));
        basicInformation.setInformationId(2l);
        service.updateBasicInformation(basicInformation);
    }

    @Test
    public void testDeleteInfo(){
        service.deleteBasicInformation(4l);
    }

    @Test
    public void testGetBasicInfo(){
        Long id = 1l;
        BasicInformation info = service.getOne(new QueryWrapper<BasicInformation>().eq("information_id", id));
        log.info(info.toString());
    }

    @Test
    public void testPageByBasicInfo(){
        int page = 1,size=10;
        Page<BasicInformation> infos = service.page(new Page<>(page, size), new QueryWrapper<BasicInformation>().eq("del_flag", 1));
        infos.getRecords().forEach(System.out::println);
        log.info(String.valueOf(infos.getTotal()));
    }
}