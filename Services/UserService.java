package Services;
import Models.User;

public interface UserService {
    String register (User user);
    String logIn (String userName, String password);
    User getUserProfile(String userId);
}
