package com.elogroup.demo.usercase;

import com.elogroup.demo.domain.UserDomain;
import com.elogroup.demo.gateway.CreateUserGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateUserUsecase {

    @Autowired
    private CreateUserGateway createUserGateway;

    public UserDomain execute(UserDomain userDomain) {
        return createUserGateway.execute(userDomain);
    }
}
