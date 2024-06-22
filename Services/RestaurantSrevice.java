package Services;

import Models.FoodItems;
import Models.Restaurant;

import java.util.ArrayList;

public interface RestaurantSrevice {

    String createRestaurant (Restaurant restaurant);
    Restaurant updateRestaurant (String restaurantId, ArrayList<FoodItems> foodItemsList);
    boolean deleteRestaurant (String restaurantId);
    boolean getRestautaurantByOwnerId (String ownerId);
}
