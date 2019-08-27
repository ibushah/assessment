package com.nsa.charitystarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Root class of the Spring Boot Application
 *
 * @SpringBootApplication does all the work.
 */

@SpringBootApplication
public class CharityApp {

    static final Logger LOG = LoggerFactory.getLogger(CharityApp.class);

    public static void main(String args[]) {
        LOG.debug("Starting app");
        SpringApplication.run(CharityApp.class, args);
    }


}




