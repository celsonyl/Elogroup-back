package com.elogroup.demo.gateway;

import com.elogroup.demo.domain.UserDomain;

public interface CreateUserGateway {

    UserDomain execute(UserDomain userDomain);
}
