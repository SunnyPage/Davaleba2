package com.company.davaleba.web.screens.carmodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.CarModel;

@UiController("davaleba_Model.browse")
@UiDescriptor("car-model-browse.xml")
@LookupComponent("carModelsTable")
@LoadDataBeforeShow
public class CarModelBrowse extends StandardLookup<CarModel> {
}