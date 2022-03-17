package com.rzhylj.mapper;

import com.rzhylj.entity.Category;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/17 0017 12:24
 * FileName: CategoryMapper
 */
public interface CategoryMapper {
    /**
     * 查询商品类别获得商品的所有信息。
     *
     * @param typename
     * @return
     */
    public Category findProductByTypename(String typename);
}
