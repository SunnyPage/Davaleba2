package com.company.davaleba.web.screens.counterparty;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Counterparty;

@UiController("davaleba_Counterparty.edit")
@UiDescriptor("counterparty-edit.xml")
@EditedEntityContainer("counterpartyDc")
@LoadDataBeforeShow
public class CounterpartyEdit extends StandardEditor<Counterparty> {
}