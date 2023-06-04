package org.example;

import org.example.Dao.impl.BookDao;
import org.example.service.impl.BookService;
import org.example.service.impl.bookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bkd = (BookDao) ctx.getBean("bookDao");
//        bkd.save();
        BookService bks = (BookService) ctx.getBean("bookService");
        bks.save();
    }
}