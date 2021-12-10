package com.itheima.service.impl;

import com.itheima.domain.Book;
import com.itheima.mapper.BookMapper;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public String save(Book book) {
        bookMapper.save(book);
        return "1";
    }

    @Override
    public List<Book> query() {
        List<Book> listBook = bookMapper.query();
        return listBook;
    }
}
