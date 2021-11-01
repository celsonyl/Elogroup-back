package com.elogroup.demo.translator;

import com.elogroup.demo.controller.model.LeadRequest;
import com.elogroup.demo.controller.model.LeadResponse;
import com.elogroup.demo.domain.LeadDomain;
import com.elogroup.demo.gateway.h2database.model.LeadDatabase;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-01T19:55:40-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
public class LeadMapperImpl implements LeadMapper {

    @Override
    public LeadDatabase leadDomainToDatabase(LeadDomain leadDomain) {
        if ( leadDomain == null ) {
            return null;
        }

        LeadDatabase leadDatabase = new LeadDatabase();

        leadDatabase.setId( leadDomain.getId() );
        leadDatabase.setName( leadDomain.getName() );
        leadDatabase.setTel( leadDomain.getTel() );
        leadDatabase.setEmail( leadDomain.getEmail() );

        return leadDatabase;
    }

    @Override
    public LeadDomain leadDatabaseToDomain(LeadDatabase leadDatabase) {
        if ( leadDatabase == null ) {
            return null;
        }

        LeadDomain leadDomain = new LeadDomain();

        leadDomain.setId( leadDatabase.getId() );
        leadDomain.setName( leadDatabase.getName() );
        leadDomain.setTel( leadDatabase.getTel() );
        leadDomain.setEmail( leadDatabase.getEmail() );

        return leadDomain;
    }

    @Override
    public LeadResponse leadDomainToResponse(LeadDomain leadDomain) {
        if ( leadDomain == null ) {
            return null;
        }

        LeadResponse leadResponse = new LeadResponse();

        leadResponse.setId( leadDomain.getId() );
        leadResponse.setName( leadDomain.getName() );
        leadResponse.setTel( leadDomain.getTel() );
        leadResponse.setEmail( leadDomain.getEmail() );

        return leadResponse;
    }

    @Override
    public LeadDomain leadRequestToDomain(LeadRequest leadRequest) {
        if ( leadRequest == null ) {
            return null;
        }

        LeadDomain leadDomain = new LeadDomain();

        leadDomain.setName( leadRequest.getName() );
        leadDomain.setTel( leadRequest.getTel() );
        leadDomain.setEmail( leadRequest.getEmail() );

        return leadDomain;
    }
}
