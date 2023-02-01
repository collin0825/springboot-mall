package com.collin.springbootmall.service;

import com.collin.springbootmall.dto.CreateOrderRequest;
import com.collin.springbootmall.dto.OrderQueryParams;
import com.collin.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
