package Services.Impl;
import Models.User;
import Services.UserService;
import Repositories.Impl.*;

public class UserServiceImpl implements UserService {
    UserRepositoryImpl userRepository = new UserRepositoryImpl();
    private static UserServiceImpl instance;

    public static UserServiceImpl getInstance() {
        if (instance==null){
            instance=new UserServiceImpl();
        }
        return instance;
    }

    static int id = 0;
    public String register (User user){
    userRepository.save(user);
    ++id;
     return "UserId =" +id;
    }

    @Override
    public String logIn(String userName, String password) {
       User user = userRepository.findByUserName(userName);
        if (user==null) {
            return "User doesn't exist";
        }
        else {
            user.getPassword().equals(password);
            return "Succesfully Logged In";
        }
    }
    public User getUserProfile(String userId){
        User user = userRepository.findById(userId);
        if (user==null){
            return null;
        }
        else{
            return user;
        }
    }
}
