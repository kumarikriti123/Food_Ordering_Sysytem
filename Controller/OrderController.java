package Controller;

import Models.Order;
import Services.Impl.OrderServiceImpl;

public class OrderController {
    static OrderServiceImpl orderService = new OrderServiceImpl();
    public static String  placeOrder (Order order){
        return orderService.placeOrder(order);
    }
    public static Order getOrderByCustomerId (String customerId){
        return orderService.getOrderByCustomerId(customerId);
    }
    public static Order getOrderByRestaurantId (String restaurantId){
        return orderService.getOrderByRestaurantId(restaurantId);
    }
    public static Order updateOrderStatus (String orderId,String status){
        return orderService.updateOrderStatus(orderId, status);
    }
}
