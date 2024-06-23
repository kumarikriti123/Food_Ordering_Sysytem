package Services;
import Models.User;

public interface UserService {
    boolean register (User user);
    boolean logIn (String userName, String password);
    User getUserProfile(String userId);
}
