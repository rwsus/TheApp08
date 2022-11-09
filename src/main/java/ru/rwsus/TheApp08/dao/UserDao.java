package ru.rwsus.TheApp08.dao;



import ru.rwsus.TheApp08.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(String name, String lastName, int age);
    void updateUser(long id, User updatedUser);
    User findUserById(long id);

    void removeUserById(long id);

}
