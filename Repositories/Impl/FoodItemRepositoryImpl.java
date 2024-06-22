package Repositories.Impl;

import Models.FoodItems;
import Models.Restaurant;
import Repositories.FoodIteamRepository;

public class FoodItemRepositoryImpl implements FoodIteamRepository {
    @Override
    public boolean saveItem(FoodItems foodItems) {
        foodItemList.add(foodItems);
        return true;
    }

    @Override
    public FoodItems findByRestaurantId(String restaurantId) {
        for (FoodItems foodItems: foodItemList){
            if (foodItems.getRestaurantId().equals(restaurantId)){
                return foodItems;
            }
        }
        return null;
    }

    @Override
    public FoodItems updateFoodItem(String foodItemId,String description, boolean availability,String price) {
        for (FoodItems foodItem: foodItemList){
            if (foodItem.getId().equals(foodItemId)){
                foodItem.setDescription(description);
                foodItem.setAvailability(availability);
                foodItem.setPrice(price);
                return foodItem;
            }
        }
        return null;
    }

    @Override
    public boolean deleteFoodItem(String foodItemId) {
        for (FoodItems foodItems : foodItemList){
            if (foodItems.getId().equals(foodItemId)){
                foodItemList.remove(foodItems);
                return true;
            }
        }
        return false;
    }
}
