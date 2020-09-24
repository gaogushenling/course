package com.course.business.controller.admin;

import com.course.server.dto.ChapterDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/")
public class ChapterController {

    @Resource
    public ChapterService chapterService;

    @GetMapping(value = "/chapter",produces = {"application/json;charset=UTF-8"})
    public List<ChapterDto> chapter(){
        return chapterService.list();
    }

}
