package service;

import java.util.List;

import model.User;
import repository.UserDao;




public class UserServiceImpl implements UserService{
    private final UserDao userDao = new UserDao();


    @Override
    public User loginUser(User theUser){
        return userDao.login(theUser);
    }

    @Override
    public User registerUser(User theUser){
        return userDao.register(theUser);
    }

    @Override
    public List<User> viewUsers(){
        return userDao.viewUsers();
    }

}

