package service;


import java.util.List;

import model.User;

public interface UserService {
    User loginUser(User theUser);
    User registerUser(User theUser);
    List<User> viewUsers();
}
