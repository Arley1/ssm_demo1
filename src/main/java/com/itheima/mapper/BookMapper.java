package com.itheima.mapper;

import com.itheima.domain.Book;
import java.util.List;

public interface BookMapper {
    public void save(Book book);
    public List<Book> query();
}
