package com.elogroup.demo.controller;

import com.elogroup.demo.controller.model.UserRequest;
import com.elogroup.demo.controller.model.UserResponse;
import com.elogroup.demo.translator.UserMapperImpl;
import com.elogroup.demo.usercase.CreateUserUsecase;
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
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private CreateUserUsecase createUserUsecase;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody @Valid UserRequest userRequest, UriComponentsBuilder uriComponentsBuilder) {
        var user = createUserUsecase.execute(new UserMapperImpl().userRequestToDomain(userRequest));
        URI uri = uriComponentsBuilder.path("user/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
