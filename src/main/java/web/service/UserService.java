package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserByID(long id);

    void addNewUser(User user);

    void updateUser(User updatedUser);

    User deleteUser(long id);
}
