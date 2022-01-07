package com.ecom.asbp.cui.cfe.auth.loginandregistration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author viveksoni100
 */
@Slf4j
@RestController
public class MasterController {

    @PostMapping("/2010-04-01/Accounts")
    void sendMessage() {
        log.info("Let's start this");
    }
}
