package com.company.davaleba.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Country;

@UiController("davaleba_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}