package com.resume.resume.service;

import com.resume.resume.entity.Expect;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* <p>
    *  服务类
    * </p>
*
* @author 康东伟
* @since 2021-01-20
*/
public interface IExpectService extends IService<Expect> {

    void addExpect(Expect dto);

    void updateExpect(Expect dto );

    void deleteExpect(Expect dto);

}
