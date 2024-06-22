package Repositories;

import Models.FoodItems;
import Models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public interface RestaurantRepository {
    ArrayList <Restaurant> resturantList = new ArrayList<>();
    boolean saveRestaurant (Restaurant restaurant);
    Restaurant findByOwnerId (String ownerId);
    Restaurant updateRestaurant (String resstaurantId , ArrayList<FoodItems> foodItemsList);
    boolean deleteRestaurant (String restaurantId);
}
