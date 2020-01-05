package com.company.davaleba.service;

import com.company.davaleba.core.CountryBean;
import com.company.davaleba.core.NumberOfDocumentsBean;
import com.company.davaleba.entity.Country;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;
import com.company.davaleba.entity.Country;

import javax.inject.Inject;
import java.util.UUID;

@Service(CountryService.NAME)
public class CountryServiceBean implements CountryService {
    @Inject
    private CountryBean Country;

    //@Transactional
    //@Override
    public Country GetCountry(UUID userId  )
    {
        return Country.GetCountry(userId);
    }

    public void SetCountry(UUID userId  )
    {
        Country.SetCountry(userId);
    }
}
