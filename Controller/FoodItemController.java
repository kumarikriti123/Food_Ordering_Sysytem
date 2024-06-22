package Controller;

import Models.FoodItems;
import Services.Impl.FoodItemServiceImpl;

public class FoodItemController {
    FoodItemServiceImpl foodItemService = new FoodItemServiceImpl();
    String addFoodItem (String restaurantId , FoodItems foodItems){
       return foodItemService.addFoodItem(restaurantId,foodItems);
    }
    FoodItems updateFoodItem (String foodItemId,String description,boolean avaibility,String price){
        return foodItemService.updateFoodItem(foodItemId, description, avaibility, price);
    }
    boolean deleteFoodItem (String foodItemId){
        return foodItemService.deleteFoodItem(foodItemId);
    }
    boolean getFoodIteByRestaurantId (String restaurantId){
        return foodItemService.getFoodIteByRestaurantId(restaurantId);
    }
}
