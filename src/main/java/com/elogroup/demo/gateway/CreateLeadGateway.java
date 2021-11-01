package com.elogroup.demo.gateway;

import com.elogroup.demo.domain.LeadDomain;

public interface CreateLeadGateway {

    LeadDomain execute(LeadDomain leadDomain);
}
