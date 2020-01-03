package com.company.davaleba.web.screens.carmanufacturers;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.CarManufacturers;

@UiController("davaleba_CarManufacturing.browse")
@UiDescriptor("car-manufacturers-browse.xml")
@LookupComponent("carManufacturersesTable")
@LoadDataBeforeShow
public class CarManufacturersBrowse extends StandardLookup<CarManufacturers> {
}