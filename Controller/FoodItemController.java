package Controller;

import Models.FoodItems;
import Services.Impl.FoodItemServiceImpl;

public class FoodItemController {
    static FoodItemServiceImpl foodItemService = new FoodItemServiceImpl();
    public static String addFoodItem (String restaurantId , FoodItems foodItems){
       return foodItemService.addFoodItem(restaurantId,foodItems);
    }
    public static FoodItems updateFoodItem (String foodItemId,String description,boolean avaibility,String price){
        return foodItemService.updateFoodItem(foodItemId, description, avaibility, price);
    }
    public static boolean deleteFoodItem (String foodItemId){
        return foodItemService.deleteFoodItem(foodItemId);
    }
    public static boolean getFoodIteByRestaurantId (String restaurantId){
        return foodItemService.getFoodIteByRestaurantId(restaurantId);
    }
}
