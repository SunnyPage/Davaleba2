package com.company.davaleba.service;

import org.springframework.stereotype.Service;

@Service(CountryConfigService.NAME)
public class CountryConfigServiceBean implements CountryConfigService {
    public String getCountry()
    {
        return getCountry();
    }

    public String getCode()
    {
        return getCode();
    }
}