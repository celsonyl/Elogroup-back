package com.elogroup.demo.usercase;

import com.elogroup.demo.domain.LeadDomain;
import com.elogroup.demo.gateway.CreateLeadGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateLeadUsecase {

    @Autowired
    private CreateLeadGateway createLeadGateway;

    public LeadDomain execute(LeadDomain leadDomain) {
        return createLeadGateway.execute(leadDomain);
    }
}