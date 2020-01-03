package com.company.davaleba.web.screens.applicationforthepurchaseofacar;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.ApplicationForThePurchaseOfACar;

@UiController("davaleba_ApplicationForThePurchaseOfACar.edit")
@UiDescriptor("application-for-the-purchase-of-a-car-edit.xml")
@EditedEntityContainer("applicationForThePurchaseOfACarDc")
@LoadDataBeforeShow
public class ApplicationForThePurchaseOfACarEdit extends StandardEditor<ApplicationForThePurchaseOfACar> {
}