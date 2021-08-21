package com.practice.ecomm.service;

import com.practice.ecomm.dto.BookDTO;
import com.practice.ecomm.entity.Book;

import java.util.List;

public interface BookService {

    public void createBookEntry(BookDTO bookDto);

    public List<Book> getBooks(Integer pageNumber,Integer pageSize);

    public void deleteEntry(Long iD);

    public Book getBookById(Long iD);

    public Book updateBook (Long iD,BookDTO bookDTO);
}
