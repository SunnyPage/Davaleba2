package com.company.davaleba.service;

import com.company.davaleba.entity.Country;
import com.haulmont.cuba.security.entity.User;

import java.util.UUID;

public interface CountryService {
    String NAME = "davaleba_CountryService";

    Country GetCountry(UUID userId);

    void SetCountry(UUID userId);
}