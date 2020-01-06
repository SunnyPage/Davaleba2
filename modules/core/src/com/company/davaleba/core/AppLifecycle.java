package com.company.davaleba.core;

import com.company.davaleba.entity.Country;
import com.company.davaleba.entity.ExtUser;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.haulmont.cuba.core.sys.AppContext;
import com.haulmont.cuba.core.sys.listener.EntityListenerManager;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

@Component("AppLifecycle")
public class AppLifecycle implements AppContext.Listener {
    @Inject
    private EntityListenerManager entityListenerManager;
    @Inject
    private Metadata metadata;

    public AppLifecycle()
    {
        AppContext.addListener(this);
    }

    @Override
    public void applicationStarted() {

        entityListenerManager.addListener(User.class, "sample_UserEntityListener");
    }

    @Component("sample_UserEntityListener")
    public class UserEntityListener implements BeforeUpdateEntityListener<User>
    {
        @Inject
        private Persistence persistence;

        @Override
        public void onBeforeUpdate(User user, EntityManager entityManager)
        {
            Transaction tx = persistence.createTransaction();
            ExtUser extUser;
            CountryConfigBean CountryConfig = new CountryConfigBean();

            try
            {
                EntityManager em = persistence.getEntityManager();
                UserSessionSource uss = AppBeans.get(UserSessionSource.class);
                User userSession = uss.getUserSession().getUser();

                Query q = persistence.getEntityManager().createNativeQuery("select u from extuser$ExtUser u where u.user = ?1");
                q.setParameter(1, userSession);
                ExtUser Extuser = (ExtUser) q.getSingleResult();

                if (Extuser.getCountry() == null)
                {
                    String StrCountry = CountryConfig.getCountry();
                    String StrCode = CountryConfig.getCode();

                    DataManager dataManager = AppBeans.get(DataManager.class);
                    Country newCountry = metadata.create(Country.class);

                    newCountry.setName(StrCountry);
                    newCountry.setCode(StrCode);

                    dataManager.commit(newCountry);

                    ExtUser newExtUser = metadata.create(ExtUser.class);
                    newExtUser.setCountry(newCountry);
                    newExtUser.setUser(userSession);
                }

                tx.commit();
            }
            finally
            {
                tx.end();
            }
        }
    }

    @Override
    public void applicationStopped()
    {

    }
}