package com.company.davaleba.core;

import com.company.davaleba.service.CountryConfigService;
import org.springframework.stereotype.Component;

@Component(CountryConfigBean.NAME)
public class CountryConfigBean implements CountryConfigService {
    public static final String NAME = "davaleba_CountryConfigBean";

    public String getCountry()
    {
        return getCountry();
    }

    public String getCode()
    {
        return getCode();
    }
}