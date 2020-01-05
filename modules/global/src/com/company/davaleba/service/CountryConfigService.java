package com.company.davaleba.service;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;

@Source(type = SourceType.DATABASE)
public interface CountryConfigService extends Config {
    String NAME = "davaleba_CountryConfigService";
    @Property("CountryConfig.Country")
    String getCountry();

    @Property("CountryConfig.Code")
    String getCode();
}