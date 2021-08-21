package com.practice.ecomm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    //@NotBlank(message = "BookId cannot be blank")
    //private String bookId;

    @NotBlank(message = "Book Name can't be blank")
    private String bookName;

    @NotBlank(message = "Author Name can't be blank")
    private String author;

    private Double price;

    private Integer quantity;

    private String publisher;

    private Integer yearPublished;

    private Integer availableSince;

    //private String isActive;


}
