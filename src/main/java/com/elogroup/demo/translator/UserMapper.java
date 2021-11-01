package com.elogroup.demo.translator;

import com.elogroup.demo.controller.model.UserRequest;
import com.elogroup.demo.controller.model.UserResponse;
import com.elogroup.demo.domain.UserDomain;
import com.elogroup.demo.gateway.h2database.model.UserDatabase;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDatabase userDomainToDatabase(UserDomain userDomain);

    UserDomain userDatabaseToDomain(UserDatabase userdatabase);

    UserDomain userRequestToDomain(UserRequest userRequest);

    UserResponse userDomainToResponse(UserDomain userDomain);
}
