package Repositories;

import Models.FoodItems;
import Models.Restaurant;

import java.util.ArrayList;

public interface FoodIteamRepository {
    ArrayList<FoodItems> foodItemList = new ArrayList<>();
    boolean saveItem (FoodItems foodItems);
    FoodItems findByRestaurantId (String restaurantId);

    public FoodItems updateFoodItem(String foodItemId,String description, boolean availability,String price);
    boolean deleteFoodItem (String foodItemId);
}
