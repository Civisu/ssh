package service;

import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.User;

@Transactional
public class UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean loginVerify(String name, String password) {
        boolean passLogin = false;
        passLogin = userDao.verifyname(name);
        if(passLogin) {
            passLogin = userDao.verifyPassword(name, password);
        }
        return passLogin;
    }

    public boolean userRegister(String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        return userDao.addUser(user);
    }
}

