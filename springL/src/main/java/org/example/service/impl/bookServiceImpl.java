package org.example.service.impl;
import org.example.Dao.impl.BookDao;
import org.example.Dao.impl.bookDaoImpl;

public class bookServiceImpl implements BookService{
    private BookDao bookDao = new bookDaoImpl();
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
