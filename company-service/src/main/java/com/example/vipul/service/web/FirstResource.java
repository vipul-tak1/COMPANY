package com.example.vipul.service.web;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;
import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author VipulTak - 21/11/20
 */
@Api(value = "Sale Transaction")
@Path("/{api_version}/sale")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Slf4j
public class FirstResource {

    @Inject
    private FirstResource() {
    }

    @GET
    @Path("/init")
    @UnitOfWork
    @ApiOperation(value = "Initiate Sale Transaction", response = Response.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Request successfully processed", response = Response.class),
            @ApiResponse(code = 422, message = "The request was well-formed but was unable to be followed due to semantic errors", response = Response.class)})
    @Timed
    @ExceptionMetered
    public Response initiateSaleTransaction(@ApiParam(value = "API version", allowableValues = "v1", required = true)
                                                @PathParam("api_version") String apiVersion,
                                            @ApiParam(value = "X-Merchant-Id", required = true) @HeaderParam("X-Merchant-Id") String merchantId) throws Exception {
        log.info("request received");
        return Response.ok().build();
    }
}
