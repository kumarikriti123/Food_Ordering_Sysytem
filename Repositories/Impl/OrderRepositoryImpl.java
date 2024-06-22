package Repositories.Impl;

import Models.Order;
import Repositories.OrderRepository;

public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public boolean saveOrder(Order order) {
        orderList.add(order);
        return true;
    }

    @Override
    public Order findByCostumerId(String costumerId) {
        for (Order order: orderList){
            order.getCustomerId().equals(costumerId);
            return order;
        }
        return null;
    }

    @Override
    public Order findByRestaurantId(String restaurantId) {
        for (Order order : orderList){
            order.getRestaurantId().equals(restaurantId);
            return order;
        }
        return null;
    }

    @Override
    public Order updateOrder(String orderId, String status) {
        for (Order order : orderList){
            order.getId().equals(orderId);
            order.setStatus(status);
            return order;
        }
        return null;
    }
}
