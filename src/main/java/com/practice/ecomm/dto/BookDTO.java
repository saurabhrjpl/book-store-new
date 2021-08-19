package com.practice.ecomm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    //@NotBlank(message = "BookId cannot be blank")
    //private String bookId;

    private String bookName;

    private String author;

    private Double price;

    private Integer quantity;

    private String publisher;

    private Integer yearPublished;


}
