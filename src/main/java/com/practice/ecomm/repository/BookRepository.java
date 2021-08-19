package com.practice.ecomm.repository;

import com.practice.ecomm.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
