package dimas.service;

import dimas.dao.UserDao;
import dimas.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);

    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
