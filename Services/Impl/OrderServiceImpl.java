package Services.Impl;

import Models.Order;
import Repositories.Impl.OrderRepositoryImpl;
import Services.OrderService;

public class OrderServiceImpl implements OrderService {
    OrderRepositoryImpl orderRepository = new OrderRepositoryImpl();
    private static OrderServiceImpl instance;

    public static OrderServiceImpl getInstance() {
        if (instance == null) {
            instance = new OrderServiceImpl();
        }
        return instance;
    }
    static int id = 0;
    @Override
    public String placeOrder(Order order) {
        orderRepository.saveOrder(order);
        ++id;
        return "Order "+id;
    }

    @Override
    public Order getOrderByCustomerId(String customerId) {
        Order order = orderRepository.findByCostumerId(customerId);
        if (order==null){
            return null;
        }
        return order;
    }

    @Override
    public Order getOrderByRestaurantId(String restaurantId) {
        Order order = orderRepository.findByRestaurantId(restaurantId);
        if(order==null){
            return null;
        }
        return null;
    }

    @Override
    public Order updateOrderStatus(String orderId, String status) {
       Order order= orderRepository.updateOrder(orderId,status);
        return order;
    }
}
