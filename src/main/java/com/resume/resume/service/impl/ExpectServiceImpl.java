package com.resume.resume.service.impl;

import com.resume.resume.entity.Expect;
import com.resume.resume.mapper.ExpectMapper;
import com.resume.resume.service.IExpectService;
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
public class ExpectServiceImpl extends ServiceImpl<ExpectMapper, Expect> implements IExpectService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addExpect(Expect dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateExpect(Expect dto){
        update(new UpdateWrapper<Expect>());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteExpect(Expect dto) {
        remove(new QueryWrapper<Expect>());
    }
}
