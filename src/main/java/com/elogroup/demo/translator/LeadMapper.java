package com.elogroup.demo.translator;

import com.elogroup.demo.controller.model.LeadRequest;
import com.elogroup.demo.controller.model.LeadResponse;
import com.elogroup.demo.domain.LeadDomain;
import com.elogroup.demo.gateway.h2database.model.LeadDatabase;
import org.mapstruct.Mapper;

@Mapper
public interface LeadMapper {

    LeadDatabase leadDomainToDatabase(LeadDomain leadDomain);

    LeadDomain leadDatabaseToDomain(LeadDatabase leadDatabase);

    LeadResponse leadDomainToResponse(LeadDomain leadDomain);

    LeadDomain leadRequestToDomain(LeadRequest leadRequest);
}
