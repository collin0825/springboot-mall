package com.collin.springbootmall.dao;

import com.collin.springbootmall.dto.ProductRequest;
import com.collin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
