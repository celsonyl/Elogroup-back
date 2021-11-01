package com.elogroup.demo.controller.handler;

import com.elogroup.demo.controller.handler.model.StandardError;
import com.elogroup.demo.controller.handler.model.ValidationError;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> methodValidation(MethodArgumentNotValidException e, HttpServletRequest httpServletRequest) {
        var error = new ValidationError("Erro de validação", httpServletRequest.getRequestURI());

        for (var x : e.getBindingResult().getFieldErrors()) {
            error.addError(x.getField(), x.getDefaultMessage());
        }
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(error);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> dataIntegrity(HttpServletRequest httpServletRequest) {
        var error = new StandardError("Usuário já existe!", httpServletRequest.getServletPath());
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(error);
    }
}