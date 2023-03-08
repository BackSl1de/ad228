package dimas.dao;

import dimas.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void create(User user);
    void update(int id);
    void delete(int id);
    User show(long id);
}
