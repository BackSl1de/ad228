package dimas.service;

import dimas.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUser(int id);
}
