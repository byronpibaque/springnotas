package com.spring.backend.controllers;

import com.spring.backend.dto.ErrorDTO;
import com.spring.backend.utils.exceptions.RequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(value = RequestException.class)
    public ResponseEntity<ErrorDTO> requestExceptionHandler(RequestException ex){
        ErrorDTO error = ErrorDTO.builder().code(ex.getCode()).mensage(ex.getMessage()).build();
        return new ResponseEntity<>(error, ex.getStatus());
    }
}
