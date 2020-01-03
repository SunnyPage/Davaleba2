package com.company.davaleba.web.screens.colour;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Colour;

@UiController("davaleba_Colour.edit")
@UiDescriptor("colour-edit.xml")
@EditedEntityContainer("colourDc")
@LoadDataBeforeShow
public class ColourEdit extends StandardEditor<Colour> {
}