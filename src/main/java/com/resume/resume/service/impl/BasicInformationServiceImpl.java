package com.resume.resume.service.impl;

import com.resume.resume.entity.BasicInformation;
import com.resume.resume.mapper.BasicInformationMapper;
import com.resume.resume.service.IBasicInformationService;
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
public class BasicInformationServiceImpl extends ServiceImpl<BasicInformationMapper, BasicInformation> implements IBasicInformationService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addBasicInformation(BasicInformation dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateBasicInformation(BasicInformation dto){
        update(new UpdateWrapper<BasicInformation>()
                .set(dto.getInformationName()!=null&&!dto.getInformationName().equals(""),"information_name",dto.getInformationName())
                .set(dto.getInformationPosition()!=null&&!dto.getInformationPosition().equals(""),"information_position",dto.getInformationPosition())
                .set(dto.getInformationEmail()!=null&&!dto.getInformationEmail().equals(""),"information_email",dto.getInformationEmail())
                .set(dto.getInformationPhone()!=null&&!dto.getInformationPhone().equals(""),"information_phone",dto.getInformationPhone())
                .set(dto.getInformationPhoto()!=null&&!dto.getInformationPhoto().equals(""),"information_birthday",dto.getInformationPhoto())
                .set(dto.getInformationToWork()!=null&&!dto.getInformationToWork().equals(""),"information_to_work",dto.getInformationToWork())
                .set(dto.getInformationBirthday()!=null&&!dto.getInformationBirthday().equals(""),"information_photo",dto.getInformationBirthday())
                .set(dto.getInformationSex()!=null&&!dto.getInformationSex().equals(""),"information_sex",dto.getInformationSex())
                .eq("information_id",dto.getInformationId())
        );
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteBasicInformation(Long id) {
        update(new UpdateWrapper<BasicInformation>().set("del_flag",2).eq("information_id",id));
    }
}
