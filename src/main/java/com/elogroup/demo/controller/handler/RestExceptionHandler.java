package com.elogroup.demo.controller.handler;

import com.elogroup.demo.controller.handler.model.StandardError;
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
    public ResponseEntity<StandardError> methodValidation(HttpServletRequest httpServletRequest) {
        var error = new StandardError("A senha deve conter no minimo 8 caracters."
                + "Um numero." + "Um caracter alfanumerico."
                + "Um caractere especial", httpServletRequest.getServletPath());
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(error);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> dataIntegrity(HttpServletRequest httpServletRequest) {
        var error = new StandardError("Usuário já existe!", httpServletRequest.getServletPath());
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(error);
    }
}