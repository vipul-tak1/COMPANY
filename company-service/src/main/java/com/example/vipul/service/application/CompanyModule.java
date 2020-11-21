package com.example.vipul.service.application;

import com.example.vipul.service.service.FirstService;
import com.example.vipul.service.service.IFirstService;
import com.google.inject.AbstractModule;

/**
 * @author VipulTak - 21/11/20
 */
public class CompanyModule extends AbstractModule {

    public CompanyModule() {
    }

    protected void configure() {
        bind(IFirstService.class).to(FirstService.class);
    }
}
