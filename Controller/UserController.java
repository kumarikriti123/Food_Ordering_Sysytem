package Controller;

import Models.User;
import Services.Impl.UserServiceImpl;

public class UserController {
    public static UserServiceImpl userService = new UserServiceImpl();
    public static boolean register (User user){
        return userService.register(user);
    }
    public static boolean logIn (String userName, String password){
        return userService.logIn(userName, password);
    }
    public User getUserProfile(String userId){
        return userService.getUserProfile(userId);
    }
}
