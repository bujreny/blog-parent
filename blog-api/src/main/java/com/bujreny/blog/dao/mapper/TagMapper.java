package com.bujreny.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bujreny.blog.dao.pojo.Tag;
import org.springframework.util.CollectionUtils;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章id查询标签列表
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    /**
     * 查询最热的标签前 limit 条
     * @param limit
     * @return
     */
    List<Long> findHotsTag(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}
