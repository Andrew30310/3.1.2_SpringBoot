package com.SpringBootProject.project_312.service;


import com.SpringBootProject.project_312.model.User;

import java.util.List;

public interface UserService {

    boolean updateUser(int oldUsersId, User newUser);
    User getUser(int id);
    List<User> getUsersList();
    void addUser(User user);
    void deleteUser(int id);

}
