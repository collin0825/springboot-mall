package com.collin.springbootmall.dao;

import com.collin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
