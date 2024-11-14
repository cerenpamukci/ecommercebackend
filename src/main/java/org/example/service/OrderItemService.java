package org.example.service;

import org.example.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    OrderItem getOrderItemById(Long id);
    List<OrderItem> getAllOrderItems();
    OrderItem createOrderItem(OrderItem orderItem);
    void deleteOrderItem(Long id);
}
