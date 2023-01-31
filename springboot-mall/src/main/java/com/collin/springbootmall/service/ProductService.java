package com.collin.springbootmall.service;

import com.collin.springbootmall.constant.ProductCategory;
import com.collin.springbootmall.dto.ProductRequest;
import com.collin.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
