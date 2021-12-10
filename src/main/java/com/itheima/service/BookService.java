package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface BookService {
    public String save(Book book);
    public List<Book> query();
}
