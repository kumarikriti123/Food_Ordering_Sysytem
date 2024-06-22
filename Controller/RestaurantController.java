package Controller;

import Models.FoodItems;
import Models.Restaurant;
import Repositories.Impl.RestaurantRepositoryImpl;
import Services.Impl.RestaurantServiceImpl;

import java.util.ArrayList;

public class RestaurantController {
    RestaurantServiceImpl restaurantService = new RestaurantServiceImpl();
    String createRestaurant (Restaurant restaurant){
        return restaurantService.createRestaurant(restaurant);
    }
    Restaurant updateRestaurant (String restaurantId, ArrayList<FoodItems> foodItemsList){
        return restaurantService.updateRestaurant(restaurantId,foodItemsList);
    }
    boolean deleteRestaurant (String restaurantId){
        return restaurantService.deleteRestaurant(restaurantId);
    }
    boolean getRestautaurantByOwnerId (String ownerId){
        return restaurantService.getRestautaurantByOwnerId(ownerId);
    }
}
