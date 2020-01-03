package com.company.davaleba.service;

import com.company.davaleba.entity.Country;
import com.haulmont.cuba.security.entity.User;

import java.util.UUID;

public interface GetCountryService {
    String NAME = "davaleba_GetCountryService";

    Country GetCountry(UUID userId);
}