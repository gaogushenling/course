package com.course.business.controller;

//import com.course.server.domain.Chapter;
//import com.course.server.service.ChapterService;


import com.course.server.pojo.Chapter;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/chapter/")
public class ChapterController {

    @Resource
    public ChapterService chapterService;

    @GetMapping(value = "/hell",produces = {"application/json;charset=UTF-8"})
    public List<Chapter> chapter(){
        return chapterService.list();
    }

}
