package com.resume.resume.service.impl;

import com.resume.resume.entity.Dominant;
import com.resume.resume.mapper.DominantMapper;
import com.resume.resume.service.IDominantService;
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
public class DominantServiceImpl extends ServiceImpl<DominantMapper, Dominant> implements IDominantService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addDominant(Dominant dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateDominant(Dominant dto){
        update(new UpdateWrapper<Dominant>());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteDominant(Dominant dto) {
        remove(new QueryWrapper<Dominant>());
    }
}
