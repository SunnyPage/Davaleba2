package com.company.davaleba.web.screens.counterparty;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Counterparty;

@UiController("davaleba_Counterparty.browse")
@UiDescriptor("counterparty-browse.xml")
@LookupComponent("counterpartiesTable")
@LoadDataBeforeShow
public class CounterpartyBrowse extends StandardLookup<Counterparty> {
}