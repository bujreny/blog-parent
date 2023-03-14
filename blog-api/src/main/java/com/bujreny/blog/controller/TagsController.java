package com.bujreny.blog.controller;

import com.bujreny.blog.service.TagService;
import com.bujreny.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/9
 */
@RestController
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagService tagService;

    @GetMapping("hot")
    public Result hot() {
        int limit = 6;
        return tagService.hot(limit);
    }

    @GetMapping
    public Result findAll() {
        return tagService.findAll();
    }

    @GetMapping("detail")
    public Result findAllDetail() {
        return tagService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result findDetailById(@PathVariable Long id) {
        return tagService.findDetailById(id);
    }
}
