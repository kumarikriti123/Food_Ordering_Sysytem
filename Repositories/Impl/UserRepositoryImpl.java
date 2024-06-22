package Repositories.Impl;
import Models.User;
import Repositories.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    public String save(User user) {
        userList.add(user);
        return "User Saved";
    }

    @Override
    public User findByUserName(String userName) {
        for (User user : userList) {
            if (user.getUsername().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByEmail(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public User findById(String userId) {
        for (User user : userList) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}
