package com.jokay.controller;

import com.jokay.entity.Book;
import com.jokay.entity.User;
import com.jokay.service.BookService;
import com.jokay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello springboot";
    }

    @RequestMapping("/thy")
    public String thyme() {
        return "hello";
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/mbp")
    @ResponseBody
    public List<User> mbp() {
        List<User> list = userService.list();
        return list;
    }

    @Autowired
    private BookService bookService;

    @RequestMapping("/addBook")
    @ResponseBody
    public Boolean saveBook() {
        Book book = new Book();
        book.setName("三寸人间");
        book.setAuthor("耳根");
        book.setDescription("举头三尺无神明，掌心三寸是人间。这是耳根继《仙逆》《求魔》《我欲封天》《一念永恒》后，创作的第五部长篇小说《三寸人间》。");
        book.setStatus(1);
        book.setAuthor("耳根");
        book.setCount(3983577);
        book.setType("武侠修真");

        return bookService.save(book);
    }
}
