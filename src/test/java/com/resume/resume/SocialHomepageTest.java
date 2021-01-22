package com.resume.resume;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resume.resume.entity.SocialHomepage;
import com.resume.resume.service.ISocialHomepageService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SocialHomepageTest {

    @Autowired
    private ISocialHomepageService service;

    @Test
    public void testAddSocialHomepage(){
        SocialHomepage socialHomepage = new SocialHomepage();
        socialHomepage.setInformationId(1l);
        socialHomepage.setSocialGithub("admins-2017");
        socialHomepage.setSocialOther("1067905926@qq.com");
        socialHomepage.setSocialQq("1067905926");
        socialHomepage.setSocialWechat("15149333955");
        service.addSocialHomepage(socialHomepage);
    }

    @Test
    public void testUpdateSocialHomepage(){
        SocialHomepage socialHomepage = new SocialHomepage();
        socialHomepage.setInformationId(1l);
//        socialHomepage.setSocialGithub("admins-2017");
//        socialHomepage.setSocialOther("1067905926@qq.com");
        socialHomepage.setSocialQq("1067905926");
        socialHomepage.setSocialWechat("15149333955");
        service.updateSocialHomepage(socialHomepage);
    }

    @Test
    public void testGetSocialHomepage(){
        SocialHomepage socialHomepage = service.getOne(new QueryWrapper<SocialHomepage>().eq("information_id", 1l));
        log.info(socialHomepage.toString());
    }
}