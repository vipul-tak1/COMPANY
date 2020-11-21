package com.example.vipul.service.application;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author VipulTak - 21/11/20
 */
@Data
public class CompanyConfiguration extends Configuration {

    @NotNull
    @Valid
    @JsonProperty(value = "swagger")
    private final SwaggerBundleConfiguration swaggerBundleConfiguration = new SwaggerBundleConfiguration();

    @NotNull
    private String pingResponse;
}
