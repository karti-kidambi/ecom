package com.ecom.service;

import com.ecom.model.Order;
import com.ecom.model.User;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order createOrder(Order order);
    Optional<Order> getOrderById(Long id);
    List<Order> getOrdersByUser(User user);
    Order updateOrderStatus(Long orderId, String status);
    void cancelOrder(Long orderId);
    List<Order> getAllOrders();
} 