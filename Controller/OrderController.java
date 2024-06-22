package Controller;

import Models.Order;
import Services.Impl.OrderServiceImpl;

public class OrderController {
    OrderServiceImpl orderService = new OrderServiceImpl();
    String  placeOrder (Order order){
        return orderService.placeOrder(order);
    }
    Order getOrderByCustomerId (String customerId){
        return orderService.getOrderByCustomerId(customerId);
    }
    Order getOrderByRestaurantId (String restaurantId){
        return orderService.getOrderByRestaurantId(restaurantId);
    }
    Order updateOrderStatus (String orderId,String status){
        return orderService.updateOrderStatus(orderId, status);
    }
}
