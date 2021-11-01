package com.elogroup.demo.translator;

import com.elogroup.demo.controller.model.UserRequest;
import com.elogroup.demo.controller.model.UserResponse;
import com.elogroup.demo.domain.UserDomain;
import com.elogroup.demo.gateway.h2database.model.UserDatabase;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-01T19:48:45-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDatabase userDomainToDatabase(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        UserDatabase userDatabase = new UserDatabase();

        userDatabase.setId( userDomain.getId() );
        userDatabase.setUsername( userDomain.getUsername() );
        userDatabase.setPassword( userDomain.getPassword() );

        return userDatabase;
    }

    @Override
    public UserDomain userDatabaseToDomain(UserDatabase userdatabase) {
        if ( userdatabase == null ) {
            return null;
        }

        UserDomain userDomain = new UserDomain();

        userDomain.setId( userdatabase.getId() );
        userDomain.setUsername( userdatabase.getUsername() );
        userDomain.setPassword( userdatabase.getPassword() );

        return userDomain;
    }

    @Override
    public UserDomain userRequestToDomain(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        UserDomain userDomain = new UserDomain();

        userDomain.setUsername( userRequest.getUsername() );
        userDomain.setPassword( userRequest.getPassword() );

        return userDomain;
    }

    @Override
    public UserResponse userDomainToResponse(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setId( userDomain.getId() );
        userResponse.setUsername( userDomain.getUsername() );
        userResponse.setPassword( userDomain.getPassword() );

        return userResponse;
    }
}
