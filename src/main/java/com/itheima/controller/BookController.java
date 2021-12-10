package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Book book){
        bookService.save(book);
        return "保存成功！";
    }

    @RequestMapping("/query")
    public ModelAndView query(ModelAndView modelAndView){
        List<Book> booklist=bookService.query();
        modelAndView.addObject("booklist",booklist);
        modelAndView.setViewName("bookList");
        return  modelAndView;
    }
}
