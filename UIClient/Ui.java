package UIClient;
import Controller.*;
import Models.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ui {

     static UserController userController = new UserController();
     RestaurantController restaurantController = new RestaurantController();
     FoodItemController foodItemController = new FoodItemController();
     OrderController orderController = new OrderController();
     static Helper helper = new Helper();

       static  {
        userController.register(new User("Kriti","abc@gmail.com","123","Owner"));
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



            System.out.println("*************** FOOD ORDERING SYSTEM **************\n");


            while (true) {


                System.out.println("Options:");
                System.out.println("1. Register");
                System.out.println("2. LogIn");
                System.out.println("3. Exit\n");

                System.out.print("Enter your option: ");
                int opt = 0;

                try {
                    opt = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.print("");
                }

                sc.nextLine();

                switch (opt) {
                    case 1:
                        register();
                        break;
                    case 2:
                        logIn();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid option!");
                        System.out.print("press Enter to go to home page : ");
                        sc.nextLine();
                }
            }
        }
         static void register() {
             Scanner sc = new Scanner(System.in);


             System.out.println("************** REGISTER ***************\n");


             System.out.print("Register as OWNER or COUSTOMER (O/C):");
             String opt = sc.nextLine();
             String role;

             if (opt.equalsIgnoreCase("o")) {
                 role = "OWNER";
             } else if (opt.equalsIgnoreCase("c")) {
                 role = "CUSTOMER";
             } else {
                 System.out.println("Invalid Input!!!");
                 return;
             }

             System.out.println("Enter Your Name : ");
             String name = sc.nextLine();

             while (!helper.checkName(name)) {
                 System.out.println("Please enter your name correctly : ");
                 name = sc.nextLine();
             }

             System.out.println("Enter Your EmailId : ");
             String email = sc.nextLine();

             System.out.println("Enter Your Password : ");
             String password = sc.nextLine();

             while (!helper.checkPassword(password)) {
                 System.out.println("Please enter a strong password : ");
                 password = sc.nextLine();
             }
             if (UserController.register(new User(name, email, password, role)))
                 System.out.println("********** Successfully Registed ***********");
             else {
                 System.out.println("Couldn't register!!!");
             }
         }
         static void logIn(){
             Scanner sc=new Scanner(System.in);


             System.out.println("************** LOG IN ************");

             System.out.println("Enter your UserName : ");
             String name = sc.nextLine();

             while (!helper.checkName(name)){
                 System.out.println("Please enter your name correctly : ");
                 name = sc.nextLine();
             }

             System.out.println("Enter Your Password : ");
             String password = sc.nextLine();

             while (!helper.checkPassword(password)){
                 System.out.println("Wrong password : ");
                 password=sc.nextLine();
             }

             if (UserController.logIn(name,password)){
                 System.out.println("************ Successfully logged In ************");
             }
             else {
                 System.out.println("Please try Again!!!");
             }
         }

}
