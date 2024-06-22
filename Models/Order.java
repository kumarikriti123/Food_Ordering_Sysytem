package Models;

import java.util.ArrayList;

public class Order {
    private String id;
    private String customerId;
    private String restaurantId;
    private String totalPrice;
    private String status;
    ArrayList <FoodItems> foodItems= new ArrayList<>();

    public Order( String customerId, String restaurantId,ArrayList<FoodItems> foodItems) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.foodItems=foodItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<FoodItems> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodItems> foodItems) {
        this.foodItems = foodItems;
    }
}
