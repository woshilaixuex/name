package org.example;

import org.example.dao.impl.BookDao;
import org.example.dao.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = (BookServiceImpl)ctx.getBean("bookService");
        bookService.save();
    }
}