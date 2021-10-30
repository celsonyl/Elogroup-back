package com.elogroup.demo.gateway.h2database;

import com.elogroup.demo.domain.UserDomain;
import com.elogroup.demo.gateway.CreateUserGateway;
import com.elogroup.demo.gateway.h2database.repository.UserRepository;
import com.elogroup.demo.translator.UserMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateUserGatewayImpl implements CreateUserGateway {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDomain execute(UserDomain userDomain) {
        var userSaved = userRepository.save(new UserMapperImpl().userDomainToDatabase(userDomain));
        return new UserMapperImpl().userDatabaseToDomain(userSaved);
    }
}
