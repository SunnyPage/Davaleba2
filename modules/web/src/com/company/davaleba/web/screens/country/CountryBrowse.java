package com.company.davaleba.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.Country;

@UiController("davaleba_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}