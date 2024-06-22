package Models;

import java.util.ArrayList;

public class Restaurant {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String ownerId;
    ArrayList <FoodItems> foodItems = new ArrayList<> ();

    public Restaurant(String ownerId ,String name,String address, String phone) {
        this.ownerId = ownerId;
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<FoodItems> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodItems> foodItems) {
        this.foodItems = foodItems;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
