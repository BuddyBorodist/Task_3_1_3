package ru.buddyborodist.springboot.service;

import ru.buddyborodist.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser (User user);

    void deleteUserById(Long id);

    User getUserById(long id);

    void updateUser (User user);

    User getUserByUsername(String username);

    User getUserByEmail(String email);
}