package com.company.davaleba.web.screens.colour;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Colour;

@UiController("davaleba_Colour.browse")
@UiDescriptor("colour-browse.xml")
@LookupComponent("coloursTable")
@LoadDataBeforeShow
public class ColourBrowse extends StandardLookup<Colour> {
}