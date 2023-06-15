package org.example.factory;

import org.example.dao.impl.UserDao;
import org.example.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
