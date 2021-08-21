package com.practice.ecomm.controller;


import com.practice.ecomm.dto.BookDTO;
import com.practice.ecomm.response.Response;
import com.practice.ecomm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookservice;

    @PostMapping
    public ResponseEntity<Response> createBook(@RequestBody BookDTO bookDTO) {
        bookservice.createBookEntry(bookDTO);
        return new ResponseEntity<Response>(
                new Response(HttpStatus.CREATED.value(), "Book Created Successfully", ""), HttpStatus.CREATED);
    }


    @GetMapping("/{pageNumber}/{pageSize}")
    public ResponseEntity<Response> returnBook(@PathVariable("pageNumber") Integer pageNumber, @PathVariable ("pageSize") Integer pageSize) {
        return new ResponseEntity<Response>(new Response(200, "Fetched Successfully", bookservice.getBooks(pageNumber,pageSize)), HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteBookByID(@PathVariable("id") Long id) {
        bookservice.deleteEntry(id);
        return new ResponseEntity<Response>(new Response(200, "Deleted Successfully", ""), HttpStatus.OK);
    }


}
