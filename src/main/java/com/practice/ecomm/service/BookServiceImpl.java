package com.practice.ecomm.service;

import com.practice.ecomm.dto.BookDTO;
import com.practice.ecomm.entity.Book;
import com.practice.ecomm.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public void createBookEntry(BookDTO bookDto) {

        Book book = new Book();
        BeanUtils.copyProperties(bookDto, book);
        Book savedBook = bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();


    }
}
