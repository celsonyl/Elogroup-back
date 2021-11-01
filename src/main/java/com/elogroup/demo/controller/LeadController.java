package com.elogroup.demo.controller;

import com.elogroup.demo.controller.model.LeadRequest;
import com.elogroup.demo.controller.model.LeadResponse;
import com.elogroup.demo.translator.LeadMapperImpl;
import com.elogroup.demo.usercase.CreateLeadUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/lead")
public class LeadController {

    @Autowired
    private CreateLeadUsecase createLeadUsecase;

    @PostMapping
    public ResponseEntity<LeadResponse> createLead(@RequestBody @Valid LeadRequest leadRequest, UriComponentsBuilder uriComponentsBuilder) {
        var leadSaved = createLeadUsecase.execute(new LeadMapperImpl().leadRequestToDomain(leadRequest));
        URI uri = uriComponentsBuilder.path("lead/{id}").buildAndExpand(leadSaved.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}