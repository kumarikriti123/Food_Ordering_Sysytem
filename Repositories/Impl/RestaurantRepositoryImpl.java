package Repositories.Impl;

import Models.FoodItems;
import Models.Restaurant;
import Models.Order;
import Repositories.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepositoryImpl implements RestaurantRepository {
    public boolean saveRestaurant (Restaurant restaurant){
     resturantList.add(restaurant);
     return true;
    }

    @Override
    public Restaurant findByOwnerId(String ownerId) {
        for (Restaurant restaurant : resturantList){
            if (restaurant.getOwnerId().equals(ownerId)){
                return restaurant;
            }
        }
        return null;
    }

    @Override
    public Restaurant updateRestaurant(String restaurantId, ArrayList<FoodItems> foodItemsList) {
        for (Restaurant restaurant : resturantList){
            if (restaurant.getId().equals(restaurantId)){
                restaurant.setFoodItems(foodItemsList);
                return restaurant;
            }
        }
        return null;
    }

    public boolean deleteRestaurant (String restaurantId){
        for (Restaurant restaurant : resturantList){
            if (restaurant.getId().equals(restaurantId)){
                resturantList.remove(restaurantId);
                return true;
            }
        }
        return false;
    }
}
