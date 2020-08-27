package com.course.business.controller;

//import com.course.server.domain.Test;
//import com.course.server.service.TestService;


import com.course.server.pojo.Test;
import com.course.server.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test/")
public class TestController {

    @Resource
    public TestService testService;

    @GetMapping(value = "/hell",produces = {"application/json;charset=UTF-8"})
    public List<Test> test(){
        return testService.list();
    }

}
