package com.company.davaleba.core;

import com.company.davaleba.entity.Country;
import com.company.davaleba.entity.ExtUser;
import com.haulmont.chile.core.datatypes.Datatypes;
import com.haulmont.chile.core.datatypes.FormatStrings;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import javax.inject.Inject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import com.haulmont.cuba.core.global.*;

@Component(CountryBean.NAME)
public class CountryBean {
    public static final String NAME = "davaleba_CountryBean";

    @Inject
    private Persistence persistence;

    @Inject
    protected GlobalConfig globalConfig;

    @Inject
    protected Configuration configuration;

    //private final static Logger log = LoggerFactory.getLogger(LocaleHelper.class);

    public Country GetCountry(UUID userId)
    {
        Transaction tx = persistence.createTransaction();
        ExtUser extUser;

        try
        {
            Query q = persistence.getEntityManager().createQuery("select u from sec$User u where u.id = ?1");
            q.setParameter(1, userId);
            List<User> list = q.getResultList();

            User user = (User) q.getSingleResult();
            if (user != null)
            {
                extUser = (ExtUser) user;
                return extUser.getCountry();
            }

            tx.commit();
        }
        finally
        {
            tx.end();
        }

        return null;
    }

    /*public void GetCountry()
    {
        User user = AppBeans.get(UserSessionSource.class).getUserSession().getUser();
        UUID userId = user.getId();

        Query query = persistence.getEntityManager().createQuery(
                "select count(*) from ExtUser where user = userId");
        query.setParameter("userId", user);
        if (query.getFirstResult() == null)
        {
            EntityManager em = persistence.getEntityManager();
            // create and execute Query
            Query query2 = em.createQuery(
                    "select * from Country o where o.User.id = userId");
            query2.setParameter("userId", userId);
            Country country = (Country) query2.getFirstResult();
            if (country == null)
            {
                Country newcountry = metadata.create(Country.class);
                newcountry.setUser(user);
                newcountry.setName(getCountryName());

                em.persist(newcountry);

                ExtUser extUser = metadata.create(ExtUser.class);
                extUser.setUser(user);
                extUser.setCountry(newcountry);

                em.persist(extUser);
            }
        }
    }*/

    public static String getCountryName()
    {
        Locale locale = AppBeans.get(UserSessionSource.class).getLocale();
        String localeName = null;

        if (StringUtils.isNotEmpty(locale.getCountry()))
        {
            return locale.getCountry();
        }
        else
        {
            Configuration configuration = AppBeans.get(Configuration.NAME);
            GlobalConfig globalConfig = configuration.getConfig(GlobalConfig.class);
            Map<String,Locale> availableLocales = globalConfig.getAvailableLocales();
            if (availableLocales.isEmpty())
                throw new IllegalStateException("Property cuba.availableLocales is not configured");

            Locale newlocale = availableLocales.values().iterator().next();
            FormatStrings formatStrings = Datatypes.getFormatStrings(newlocale);

            return "";
        }
    }
}