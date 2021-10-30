package com.elogroup.demo.translator;

import com.elogroup.demo.controller.model.UserRequest;
import com.elogroup.demo.controller.model.UserResponse;
import com.elogroup.demo.domain.UserDomain;
import com.elogroup.demo.gateway.h2database.model.Userdatabase;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-30T16:02:34-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public Userdatabase userDomainToDatabase(UserDomain userDomain) {
        if ( userDomain == null ) {
            return null;
        }

        Userdatabase userdatabase = new Userdatabase();

        userdatabase.setId( userDomain.getId() );
        userdatabase.setUsername( userDomain.getUsername() );
        userdatabase.setPassword( userDomain.getPassword() );

        return userdatabase;
    }

    @Override
    public UserDomain userDatabaseToDomain(Userdatabase userdatabase) {
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
