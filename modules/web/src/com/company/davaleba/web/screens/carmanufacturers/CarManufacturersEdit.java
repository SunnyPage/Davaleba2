package com.company.davaleba.web.screens.carmanufacturers;

import com.company.davaleba.entity.Country;
import com.company.davaleba.service.GetCountryService;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.app.security.user.browse.UserBrowser;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.data.ValueSource;
import com.haulmont.cuba.gui.components.data.ValueSourceProvider;
import com.haulmont.cuba.gui.components.data.value.ContainerValueSource;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.davaleba.entity.CarManufacturers;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.web.App;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.UUID;

@UiController("davaleba_CarManufacturing.edit")
@UiDescriptor("car-manufacturers-edit.xml")
@EditedEntityContainer("carManufacturersDc")
@LoadDataBeforeShow
public class CarManufacturersEdit extends StandardEditor<CarManufacturers> {
    @Inject
    private GetCountryService getCountryService;

    @Inject
    private UiComponents uiComponents;

    @Inject
    private InstanceContainer<CarManufacturers> CarM;

    @Inject
    @Named("CountryField")
    private LookupPickerField CountryField;

    @Inject
    private ScreenBuilders screenBuilders;

    @Subscribe
    public void onInit(InitEvent event) {


    }

    @Inject
    private Form form;

    @Subscribe
    public void onInitEntity(InitEntityEvent<CarManufacturers> event) {
        App app = App.getInstance();
        Country country;

        if (App.getInstance().getConnection().getSession() != null) {
            UUID userId = App.getInstance().getConnection().getSession().getUser().getId();

            country = getCountryService.GetCountry(userId);

            CountryField.setValue(country);
        }
    }
}