package com.company.davaleba.service;

import com.company.davaleba.core.NumberOfDocumentsBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.UUID;

@Service(NumberOfDocumentsService.NAME)
public class NumberOfDocumentsServiceBean implements NumberOfDocumentsService {

    @Inject
    private NumberOfDocumentsBean NumberOfDocuments;

    //@Transactional
    //@Override
    public Integer GetNumberOfDocuments(UUID CounterpartyId)
    {
        return NumberOfDocuments.GetNumberOfDocuments(CounterpartyId);
    }
}