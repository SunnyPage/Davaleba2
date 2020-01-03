package com.company.davaleba.web.screens;

import com.company.davaleba.service.GetCountryService;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.web.app.main.MainScreen;
import jdk.nashorn.internal.objects.annotations.Property;

import javax.inject.Inject;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.UUID;


@UiController("extMainScreen")
@UiDescriptor("ext-main-screen.xml")
public class ExtMainScreen extends MainScreen {

    //GetCountryService CountryService;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        //CountryService.GetCountry();

    }

    @Inject
    protected UserSessionSource userSessionSource;

    @Inject
    protected PasswordEncryption passwordEncryption;
}
