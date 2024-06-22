package Services.Impl;

import Models.FoodItems;
import Models.Restaurant;
import Repositories.Impl.RestaurantRepositoryImpl;
import Repositories.RestaurantRepository;
import Services.RestaurantSrevice;

import java.util.ArrayList;

public class RestaurantServiceImpl implements RestaurantSrevice {
   RestaurantRepositoryImpl restaurantRepository = new RestaurantRepositoryImpl();
    private static RestaurantServiceImpl instance;

    public static RestaurantServiceImpl getInstance() {
        if (instance==null){
            instance=new RestaurantServiceImpl();
        }
        return instance;
    }

    static int id = 0;
    @Override
    public String createRestaurant(Restaurant restaurant) {
        restaurantRepository.saveRestaurant(restaurant);
        ++id;
        return "Restaurant Id "+id;
    }

    @Override
    public boolean deleteRestaurant(String restaurantId) {
        restaurantRepository.deleteRestaurant(restaurantId);
        return true;
    }
    public Restaurant updateRestaurant (String restaurantId, ArrayList<FoodItems> foodItemsList){
        Restaurant restaurant =restaurantRepository.updateRestaurant(restaurantId,foodItemsList);
        return restaurant;
    }
    public boolean getRestautaurantByOwnerId (String ownerId){
        restaurantRepository.findByOwnerId(ownerId);
        return true;
    }
}
