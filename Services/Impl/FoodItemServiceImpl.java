package Services.Impl;

import Models.FoodItems;
import Models.Restaurant;
import Repositories.Impl.FoodItemRepositoryImpl;
import Services.FoodItemService;

public class FoodItemServiceImpl implements FoodItemService {
    FoodItemRepositoryImpl foodItemRepository = new FoodItemRepositoryImpl();
    private static FoodItemServiceImpl instance;
    public static FoodItemServiceImpl getInstance(){
        if (instance==null){
            instance=new FoodItemServiceImpl();
        }
        return instance;
    }
    static int id= 0 ;
    public  String addFoodItem (String restaurantId , FoodItems foodItems){
        foodItemRepository.saveItem(foodItems);
        ++id;
        return "FoodItem "+id;
    }

    @Override
    public FoodItems updateFoodItem(String foodItemId, String description,boolean availability,String price) {
        FoodItems foodItems1 = foodItemRepository.updateFoodItem(foodItemId,description,availability,price);
        return foodItems1;
    }

    @Override
    public boolean deleteFoodItem(String foodItemId) {
        foodItemRepository.deleteFoodItem(foodItemId);
        return true;
    }

    @Override
    public boolean getFoodIteByRestaurantId(String restaurantId) {
        foodItemRepository.findByRestaurantId(restaurantId);
        return true;
    }
}
