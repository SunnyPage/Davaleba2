package com.company.davaleba.web.screens.applicationforthepurchaseofacar;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.ApplicationForThePurchaseOfACar;

@UiController("davaleba_ApplicationForThePurchaseOfACar.browse")
@UiDescriptor("application-for-the-purchase-of-a-car-browse.xml")
@LookupComponent("applicationForThePurchaseOfACarsTable")
@LoadDataBeforeShow
public class ApplicationForThePurchaseOfACarBrowse extends StandardLookup<ApplicationForThePurchaseOfACar> {
}