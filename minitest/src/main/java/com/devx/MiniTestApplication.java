package com.devx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Subash
 * @since 5/25/2021
 */
@SpringBootApplication
public class MiniTestApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(MiniTestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MiniTestApplication.class, args);
        LOGGER.info("Mini Test Application has started running");
    }

}
