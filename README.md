
Food Ordering System

MODEL
1.   USER
// atributes   
 String id
 String userName
 String password
 String email
 String role

// constructor
   User(userName,email,password,role)

//getter & setter

2. Restaurant
// atributes
 String id
 String name
 String address
 String phone
 String ownerId
 ArrayList <FoodItems>

 //constructor
   Restaurant(ownerId,name,address,phone)

// getter & setter

3. FoodItems
// atributes
   String id
   String restaurantId
   String name
   String description
   String price
   boolean availability

//constructor
  FoodItems(restaurantId,price,name,description)

//getter & setter

4.Order
//atributes
  String id
  String customerId
  String restaurantId
  String totalPrice
  String status
  ArrayList <FoodItems> 

//constructor
  Order(customerId,restaurantId,ArrayList<FoodItems>)

//getter & setter

REPOSITORY
1. UserRepository
      ArrayList <User> userList = new ArrayList<>()
   
    String save (User user)
   // Add user to user list
    
    User findByUserName(String userName)
   // It will search for the userName and returns user
   
    User findByEmail(String email)
   // It will search for the email of the user and returns user
   
    User findById(String userId)
   // It will search for the userId of user and returns user

2. RestaurantRepository
   ArrayList <Restaurant> resturantList = new ArrayList<>()
   
    boolean saveRestaurant (Restaurant restaurant)
   // Add restaurant to the list of restaurants
   
    Restaurant findByOwnerId (String ownerId)
   //It will search for the ownerId and retrun it
   
    Restaurant updateRestaurant (String restaurantId , ArrayList<FoodItems>)
   // It will update restaurant fooditems return it
  
    boolean deleteRestaurant (String restaurantId)
  //It will remove restaurant from the list	

3. FoodItemRepository
   ArrayList<FoodItems> foodItemList = new ArrayList<>()

    boolean saveItem (FoodItems foodItems)
  //Add fooditem to the list of foodItems

    FoodItems findByRestaurantId (String restaurantId)
  //It will search for the restaurantId and return it

    public FoodItems updateFoodItem(String foodItemId,String description, boolean availability,String price)
  //It will update the details of the foodItems

    boolean deleteFoodItem (String foodItemId)
  //It will remove the foodItem form list

4. OrderRepository
    ArrayList <Order> orderList = new ArrayList<>()

     boolean saveOrder (Order order)
   //Add the order to the list

     Order findByCostumerId (String costumerId)
   //It will search for the costumerId and return it

     Order findByRestaurantId (String restaurantId)
   //It will search for the restaurantId and return it

     Order updateOrder (String orderId,String status)
   //It will update the order details

SERVICE
1. UserService
   UserRepository obj

    String register (User user)
  //Register an user and saves it

    String logIn (String userName, String password)
  //Existing user can logIn

    User getUserProfile(String userId)
  //It will give the profile of the user

2. RestaurantService
   RestaurantRepository obj

    String createRestaurant (Restaurant restaurant)
  //It will create a new restaurant and saves it

    Restaurant updateRestaurant (String restaurantId, ArrayList<FoodItems>)
  //It will update the restaurant 

    boolean deleteRestaurant (String restaurantId)
  //It will delete the restaurant

    boolean getRestautaurantByOwnerId (String ownerId)
  //It will give the details of the restaurant by the ownerId

3. FoodItemService
   FoodItemRepository obj

     String addFoodItem (String restaurantId , FoodItems foodItems)
   //Add fooditem to the list

     FoodItems updateFoodItem (String foodItemId,String description,boolean avaibility,String price)
   //It will update the fooditem details 

     boolean deleteFoodItem (String foodItemId)
   //It will remove the fooditem 

     boolean getFoodIteByRestaurantId (String restaurantId)
   //It will the full details of the fooditems by the restaurant

4. OrderService
   OrederRepository obj

      String  placeOrder (Order order)
    //Place the order

      Order getOrderByCustomerId (String customerId)
    //It will show the order by the customerId

      Order getOrderByRestaurantId (String restaurantId)
    //It will show the order by the restaurantId

      Order updateOrderStatus (String orderId,String status)
    //It will update the status of the order

CONTROLLER
    
     create obj of the service classes and call the methods
