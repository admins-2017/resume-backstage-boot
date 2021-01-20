package com.resume.resume.service;

import com.resume.resume.entity.SocialHomepage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* <p>
    *  服务类
    * </p>
*
* @author 康东伟
* @since 2021-01-20
*/
public interface ISocialHomepageService extends IService<SocialHomepage> {

    void addSocialHomepage(SocialHomepage dto);

    void updateSocialHomepage(SocialHomepage dto );

    void deleteSocialHomepage(SocialHomepage dto);

}
