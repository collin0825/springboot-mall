package com.collin.springbootmall.service;

import com.collin.springbootmall.dto.ProductRequest;
import com.collin.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
