package com.course.server.service;

import com.course.server.mapper.ChapterMapper;
import com.course.server.pojo.Chapter;
import com.course.server.pojo.ChapterExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<Chapter> list() {
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.setOrderByClause("id desc");
        return chapterMapper.selectByExample(chapterExample);
    };

}
