package Services;

import Models.FoodItems;
import Models.Restaurant;

import java.util.ArrayList;

public interface FoodItemService {
    String addFoodItem (String restaurantId , FoodItems foodItems);
    FoodItems updateFoodItem (String foodItemId,String description,boolean avaibility,String price);
    boolean deleteFoodItem (String foodItemId);
    boolean getFoodIteByRestaurantId (String restaurantId);
}
