package Controller;

import Models.User;
import Services.Impl.UserServiceImpl;

public class UserController {
    UserServiceImpl userService = new UserServiceImpl();
    String register (User user){
        return userService.register(user);
    }
    String logIn (String userName, String password){
        return userService.logIn(userName, password);
    }
    User getUserProfile(String userId){
        return userService.getUserProfile(userId);
    }
}
