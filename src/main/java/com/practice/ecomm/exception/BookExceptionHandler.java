package com.practice.ecomm.exception;

import com.practice.ecomm.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BookExceptionHandler {

    public ResponseEntity<Response> handleBookException(BookException ex) {
        Response error = new Response(ex.getStatusCode(), ex.getStatusMessage(), null);
        return new ResponseEntity<Response>(error, HttpStatus.BAD_GATEWAY);
    }
}

