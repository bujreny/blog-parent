package com.bujreny.blog.controller;

import com.bujreny.blog.service.CategoryService;
import com.bujreny.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/12
 */
@RestController
@RequestMapping("categorys")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public Result categories() {
        return categoryService.findAll();
    }

    @GetMapping("detail")
    public Result categoriesDetail() {
        return categoryService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result categorieDetailById(@PathVariable("id") Long id) {
        return categoryService.categorieDetailById(id);
    }

}
