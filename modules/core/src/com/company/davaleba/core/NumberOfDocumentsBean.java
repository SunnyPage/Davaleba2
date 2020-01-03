package com.company.davaleba.core;

import com.company.davaleba.entity.ApplicationForThePurchaseOfACar;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import org.springframework.stereotype.Component;
import javax.inject.Inject;
import java.util.UUID;

@Component(NumberOfDocumentsBean.NAME)
public class NumberOfDocumentsBean {
    public static final String NAME = "davaleba_NumberOfDocumentsBean";

    @Inject
    private Persistence persistence;

    public Integer GetNumberOfDocuments(UUID CounterpartyId)
    {
        Query query = persistence.getEntityManager().createQuery(
                "select count(*) from ApplicationForThePurchaseOfACar where counterparty = CounterpartyId");
        query.setParameter("CounterpartyId", CounterpartyId);
        return (Integer) query.getFirstResult();
    }
}