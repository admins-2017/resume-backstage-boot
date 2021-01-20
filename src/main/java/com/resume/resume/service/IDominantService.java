package com.resume.resume.service;

import com.resume.resume.entity.Dominant;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* <p>
    *  服务类
    * </p>
*
* @author 康东伟
* @since 2021-01-20
*/
public interface IDominantService extends IService<Dominant> {

    void addDominant(Dominant dto);

    void updateDominant(Dominant dto );

    void deleteDominant(Dominant dto);

}
