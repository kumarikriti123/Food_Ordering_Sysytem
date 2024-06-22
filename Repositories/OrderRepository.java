package Repositories;

import Models.Order;

import java.util.ArrayList;

public interface OrderRepository {
     ArrayList <Order> orderList = new ArrayList<>();
     boolean saveOrder (Order order);
     Order findByCostumerId (String costumerId);
     Order findByRestaurantId (String restaurantId);
     Order updateOrder (String orderId,String status);
}
