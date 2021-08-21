package com.practice.ecomm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bookName;
    private String author;
    private Double price;
    private Integer quantity;
    private String publisher;
    private Integer yearPublished;
    private Integer availableSince;
    @Column(columnDefinition = "varchar(1) default Y")
    private String isActive;


}
