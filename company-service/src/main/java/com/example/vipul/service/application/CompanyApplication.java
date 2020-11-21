package com.example.vipul.service.application;

import com.example.vipul.service.web.FirstResource;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * @author VipulTak - 21/11/20
 */
public class CompanyApplication extends Application<CompanyConfiguration> {

    public void run(CompanyConfiguration companyConfiguration, Environment environment) throws Exception {
        Injector injector = Guice.createInjector(new CompanyModule());
        environment.jersey().register(injector.getInstance(FirstResource.class));
    }

    public static void main(String[] args) throws Exception {
        new CompanyApplication().run(args);
    }
}
