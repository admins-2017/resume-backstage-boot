package com.resume.resume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resume.resume.entity.Expect;
import com.resume.resume.service.IExpectService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ExpectTest {

    @Autowired
    private IExpectService service;

    @Test
    public void testAddExpect(){
        Expect expect = new Expect();
        expect.setInformationId(1l);
        expect.setExpectAddress("呼和浩特市");
        expect.setExpectPosition("前端工程师");
        expect.setExpectRemark("能接受出差和加班");
        expect.setExpectSalary(BigDecimal.valueOf(8000.0));
        expect.setExpectType(false);

        service.addExpect(expect);
    }

    @Test
    public void testUpdateExpect(){
        Expect expect = new Expect();
//        expect.setExpectAddress("包头市");
//        expect.setExpectPosition("前端/全栈工程师");
        expect.setExpectRemark("能接受加班 短时间出差，不接受长期出差");
        expect.setExpectSalary(BigDecimal.valueOf(12000.0));
        expect.setExpectType(false);
        expect.setExpectId(2);
        service.updateExpect(expect);
    }

    @Test
    public void testGetExpect(){

        List<Expect> expects = service.list(new QueryWrapper<Expect>().eq("information_id", 1));
        expects.forEach(System.out::println);
    }

}