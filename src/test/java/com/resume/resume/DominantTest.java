package com.resume.resume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resume.resume.entity.Dominant;
import com.resume.resume.service.IDominantService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class DominantTest {

    @Autowired
    private IDominantService service;

    @Test
    public void testAddDominant(){
        Dominant dominant = new Dominant();
        dominant.setInformationId(1L);
        dominant.setDominantDetail("精通JAVA 熟悉html，css ，javascript, vue.js ,熟悉公众号，小程序开发,熟练使用 MySQL和Oracle数据库及SQL语句,熟悉 Tomcat，Nginx部署和配置,熟悉Restful风格开发接口," +
                "熟练掌握 Spring, spring MVC ,Security，Mybatis-plus ,struts ,Hibernate，springboot，springCloudAlibaba，quartz等框架的使用,熟悉LINUX及常用环境搭建，熟悉常用命令及docker镜像化部署等"
                +"熟悉rabbitMQ中间件使用以及ElasticSearch搜索引擎的使用，熟悉缓存redis开发及配置，熟悉文档类开发");
        service.addDominant(dominant);
    }

    @Test
    public void testUpdateDominant(){
        Dominant dominant = new Dominant();
        dominant.setDominantDetail("精通JAVA 熟悉html，css ，javascript, vue.js ,熟悉公众号，小程序开发,熟练使用 MySQL和Oracle数据库及SQL语句,熟悉 Tomcat，Nginx部署和配置,熟悉Restful风格开发接口," +
                "熟练掌握 Spring, spring MVC ,Security，Mybatis-plus ,struts ,Hibernate，springboot，springCloudAlibaba，quartz等框架的使用,熟悉LINUX及常用环境搭建，熟悉常用命令及docker镜像化部署等"
                +"熟悉rabbitMQ中间件使用以及ElasticSearch搜索引擎的使用，熟悉缓存redis开发及配置，熟悉文档类开发");
        dominant.setInformationId(1l);
        service.updateDominant(dominant);
    }

    @Test
    public void testGetDominant(){
        Dominant dominant = service.getOne(new QueryWrapper<Dominant>().eq("information_id", 1l));
        log.info(dominant.toString());
    }
}