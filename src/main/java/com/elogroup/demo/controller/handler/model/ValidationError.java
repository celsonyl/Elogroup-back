package com.elogroup.demo.controller.handler.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError implements Serializable {

    private final List<FieldMessage> errors = new ArrayList<>();

    public ValidationError() {
    }

    public ValidationError(String message, String path) {
        super(message, path);
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }
}