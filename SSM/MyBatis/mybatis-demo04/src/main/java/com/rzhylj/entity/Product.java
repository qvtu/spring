package com.rzhylj.entity;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/17 0017 11:51
 * FileName: Product
 */
public class Product {
    private Integer id;
    private String goodsname;
    private Integer price;
    private Integer category_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", category_id=" + category_id +
                '}';
    }
}
