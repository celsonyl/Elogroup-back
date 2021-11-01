package com.elogroup.demo.controller.validation;

import com.elogroup.demo.controller.handler.model.FieldMessage;
import com.elogroup.demo.controller.model.LeadRequest;
import com.elogroup.demo.gateway.h2database.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class LeadInsertValidator implements ConstraintValidator<LeadInsert, LeadRequest> {

    @Autowired
    private LeadRepository leadRepository;

    @Override
    public void initialize(LeadInsert ann) {
    }

    @Override
    public boolean isValid(LeadRequest leadRequest, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        var find = leadRepository.findByEmail(leadRequest.getEmail());

        if (find != null) {
            list.add(new FieldMessage("email", "Email já existe!"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }
        return list.isEmpty();
    }
}
