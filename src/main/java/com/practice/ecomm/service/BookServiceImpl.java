package com.practice.ecomm.service;

import com.practice.ecomm.dto.BookDTO;
import com.practice.ecomm.entity.Book;
import com.practice.ecomm.exception.BookException;
import com.practice.ecomm.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
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
        bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks(Integer pageNumber, Integer pageSize) {
        PageRequest pageable = PageRequest.of(pageNumber, pageSize);
        return bookRepository.findAll(pageable).toList();
    }

    @Override
    public void deleteEntry(Long iD) {
        Book PresentBook = findById(iD);
        PresentBook.setIsActive("N");
    }

    @Override
    public Book getBookById(Long iD) {
        return findById(iD);

    }

    @Override
    public Book updateBook(Long iD, BookDTO bookDTO) {
        Book Books = findById(iD);
        BeanUtils.copyProperties(bookDTO, Books);
        return Books;

    }

    public Book findById(Long iD) {
        return bookRepository.findById(iD).orElseThrow(() -> new BookException(HttpStatus.NOT_FOUND.value(), "Book Not Present"));
    }

}
