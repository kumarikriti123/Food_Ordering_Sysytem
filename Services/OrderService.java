package Services;

import Models.Order;

public interface OrderService {
      String  placeOrder (Order order);
      Order getOrderByCustomerId (String customerId);
      Order getOrderByRestaurantId (String restaurantId);
      Order updateOrderStatus (String orderId,String status);
}
