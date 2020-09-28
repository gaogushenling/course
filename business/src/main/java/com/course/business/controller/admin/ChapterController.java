package com.course.business.controller.admin;

import com.course.server.dto.PageDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/chapter/")
public class ChapterController {

    @Resource
    public ChapterService chapterService;

    @PostMapping(value = "list", produces = {"application/json;charset=UTF-8"})
    public PageDto list(@RequestBody PageDto pageDto) {
        chapterService.list(pageDto);
        return pageDto;
    }

}
