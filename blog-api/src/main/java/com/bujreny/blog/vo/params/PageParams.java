package com.bujreny.blog.vo.params;

import lombok.Data;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/9
 */
@Data
public class PageParams {
    private int page = 1;
    private int pageSize = 10;
    private String categoryId;
    private String tagId;
    private String year;
    private String month;

    public String getMonth() {
        if (month != null && month.length() == 1) {
            return "0" + month;
        }
        return month;
    }
}
