package com.company.davaleba.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Car;

@UiController("davaleba_Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
@LoadDataBeforeShow
public class CarEdit extends StandardEditor<Car> {
}