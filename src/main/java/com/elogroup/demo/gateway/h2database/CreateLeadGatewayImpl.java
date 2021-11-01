package com.elogroup.demo.gateway.h2database;

import com.elogroup.demo.domain.LeadDomain;
import com.elogroup.demo.gateway.CreateLeadGateway;
import com.elogroup.demo.gateway.h2database.repository.LeadRepository;
import com.elogroup.demo.translator.LeadMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateLeadGatewayImpl implements CreateLeadGateway {

    @Autowired
    private LeadRepository leadRepository;

    @Override
    public LeadDomain execute(LeadDomain leadDomain) {
        var leadSaved = leadRepository.save(new LeadMapperImpl().leadDomainToDatabase(leadDomain));
        return new LeadMapperImpl().leadDatabaseToDomain(leadSaved);
    }
}
