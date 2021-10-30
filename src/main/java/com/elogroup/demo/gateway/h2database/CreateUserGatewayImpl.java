package com.elogroup.demo.gateway.h2database;

import com.elogroup.demo.domain.UserDomain;
import com.elogroup.demo.gateway.CreateUserGateway;
import com.elogroup.demo.gateway.h2database.repository.UserRepository;
import com.elogroup.demo.translator.UserMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CreateUserGatewayImpl implements CreateUserGateway {

    @Autowired
    private UserRepository userRepository;

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDomain execute(UserDomain userDomain) {
        userDomain.setPassword(passwordEncoder.encode(userDomain.getPassword()));
        var userSaved = userRepository.save(new UserMapperImpl().userDomainToDatabase(userDomain));
        return new UserMapperImpl().userDatabaseToDomain(userSaved);
    }
}
