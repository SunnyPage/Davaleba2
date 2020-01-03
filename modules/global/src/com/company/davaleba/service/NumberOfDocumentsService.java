package com.company.davaleba.service;

import java.util.UUID;

public interface NumberOfDocumentsService {
    String NAME = "davaleba_NumberOfDocumentsService";

    Integer GetNumberOfDocuments(UUID CounterpartyId);
}