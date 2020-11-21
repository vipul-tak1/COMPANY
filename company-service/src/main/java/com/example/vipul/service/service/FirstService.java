package com.example.vipul.service.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author VipulTak - 21/11/20
 */
@Slf4j
public class FirstService implements IFirstService {

    public String fetchResponse(String request) {
        log.info("request received in service: {}", request);
        return request;
    }
}
