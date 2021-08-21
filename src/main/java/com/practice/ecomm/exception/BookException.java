package com.practice.ecomm.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookException extends RuntimeException {
    private Integer statusCode;
    private String statusMessage;
}
