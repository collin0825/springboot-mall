package com.collin.springbootmall.service;

import com.collin.springbootmall.dto.CreateOrderRequest;
import com.collin.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
