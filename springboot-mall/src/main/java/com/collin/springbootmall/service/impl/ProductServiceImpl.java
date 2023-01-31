package com.collin.springbootmall.service.impl;

import com.collin.springbootmall.dao.ProductDao;
import com.collin.springbootmall.model.Product;
import com.collin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
