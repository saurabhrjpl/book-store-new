package com.practice.ecomm.service;

import com.practice.ecomm.dto.BookDTO;
import com.practice.ecomm.entity.Book;

import java.util.List;

public interface BookService {

    public void createBookEntry(BookDTO bookDto);

    public List<Book> getBooks();
}
