package com.rzhylj.entity;

import java.util.List;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/17 0017 11:51
 * FileName: Category
 */
public class Category {
    private Integer id;
    private String typename;
    private List<Product> productList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", productList=" + productList +
                '}';
    }
}
