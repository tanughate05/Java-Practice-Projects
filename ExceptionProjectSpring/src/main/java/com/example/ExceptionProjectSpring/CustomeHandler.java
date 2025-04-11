package com.example.ExceptionProjectSpring;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomeHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value ={Exception.class})
    public ResponseEntity<Object> exceptionHandler(Exception ex, WebRequest request) {
        String msg =  " the error msg ";

        return handleExceptionInternal(ex,msg,new HttpHeaders(),HttpStatus.OK,request);

    }
}
