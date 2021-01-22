package com.resume.resume.service.impl;

import com.resume.resume.entity.SocialHomepage;
import com.resume.resume.mapper.SocialHomepageMapper;
import com.resume.resume.service.ISocialHomepageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
/**
* @author 康东伟
* @since 2021-01-20
*/
@Service
public class SocialHomepageServiceImpl extends ServiceImpl<SocialHomepageMapper, SocialHomepage> implements ISocialHomepageService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addSocialHomepage(SocialHomepage dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSocialHomepage(SocialHomepage dto){
        update(new UpdateWrapper<SocialHomepage>()
                .set(dto.getSocialGithub()!=null&&!dto.getSocialGithub().equals("social_github"),"",dto.getSocialGithub())
                .set(dto.getSocialOther()!=null&&!dto.getSocialOther().equals("social_other"),"",dto.getSocialOther())
                .set(dto.getSocialQq()!=null&&!dto.getSocialQq().equals(""),"social_qq",dto.getSocialQq())
                .set(dto.getSocialWechat()!=null&&!dto.getSocialWechat().equals(""),"social_wechat",dto.getSocialWechat())
                .eq("information_id",dto.getInformationId()));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteSocialHomepage(SocialHomepage dto) {
        remove(new QueryWrapper<SocialHomepage>());
    }
}
