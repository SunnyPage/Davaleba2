package com.company.davaleba.web.screens.carmodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.CarModel;

@UiController("davaleba_Model.edit")
@UiDescriptor("car-model-edit.xml")
@EditedEntityContainer("carModelDc")
@LoadDataBeforeShow
public class CarModelEdit extends StandardEditor<CarModel> {
}