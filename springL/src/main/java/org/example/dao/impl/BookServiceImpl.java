package org.example.dao.impl;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }

}
