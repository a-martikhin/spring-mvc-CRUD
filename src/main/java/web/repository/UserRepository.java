package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();

    User getUserByID(long id);

    void addNewUser(User user);

    void updateUser(User updatedUser);

    User deleteUser(long id);

}
