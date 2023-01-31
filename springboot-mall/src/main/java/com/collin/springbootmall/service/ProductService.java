package com.collin.springbootmall.service;

import com.collin.springbootmall.dto.ProductQueryParams;
import com.collin.springbootmall.dto.ProductRequest;
import com.collin.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
