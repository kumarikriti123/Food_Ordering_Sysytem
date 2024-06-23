package Controller;

import Models.FoodItems;
import Models.Restaurant;
import Repositories.Impl.RestaurantRepositoryImpl;
import Services.Impl.RestaurantServiceImpl;

import java.util.ArrayList;

public class RestaurantController {
    static RestaurantServiceImpl restaurantService = new RestaurantServiceImpl();
    public static String createRestaurant (Restaurant restaurant){
        return restaurantService.createRestaurant(restaurant);
    }
    public static Restaurant updateRestaurant (String restaurantId, ArrayList<FoodItems> foodItemsList){
        return restaurantService.updateRestaurant(restaurantId,foodItemsList);
    }
    public static boolean deleteRestaurant (String restaurantId){
        return restaurantService.deleteRestaurant(restaurantId);
    }
    public static boolean getRestautaurantByOwnerId (String ownerId){
        return restaurantService.getRestautaurantByOwnerId(ownerId);
    }
}
