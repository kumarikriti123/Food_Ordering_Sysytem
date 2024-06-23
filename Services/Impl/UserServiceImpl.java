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
    public boolean register (User user){
    userRepository.save(user);
    ++id;
        System.out.println( "UserId =" +id);
        return true;
    }

    @Override
    public boolean logIn(String userName, String password) {
       User user = userRepository.findByUserName(userName);
        if (user==null) {
            System.out.println("User doesn't exist");
        }
        else {
            user.getPassword().equals(password);
            System.out.println("Succesfully Logged In");
        }
        return true;
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
