package com.bujreny.blog.service;

import com.bujreny.blog.vo.CategoryVo;
import com.bujreny.blog.vo.Result;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/11
 */
public interface CategoryService {
    /**
     * 通过 categoryId 查找 category
     * @param categoryId
     * @return
     */
    CategoryVo findCategoryById(Long categoryId);


    /**
     * 查询所有类别
     * @return
     */
    Result findAll();

    /**
     * 查询所有类别详情
     * @return
     */
    Result findAllDetail();
    /**
     * 根据 id 查询类别详细信息
     * @param id
     * @return
     */
    Result categorieDetailById(Long id);
}
