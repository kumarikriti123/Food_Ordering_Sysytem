package Repositories;
import Models.User;

import java.util.ArrayList;

public interface UserRepository {
    ArrayList <User> userList = new ArrayList<>();
    String save (User user);
    User findByUserName(String userName);
    User findByEmail(String email);
    User findById(String userId);
}
