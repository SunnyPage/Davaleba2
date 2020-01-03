package com.company.davaleba.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Car;

@UiController("davaleba_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {
}