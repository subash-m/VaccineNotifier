package com.devx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Subash
 * @since 5/26/2021
 */
public class Scheduler {

    private static Logger LOGGER = LoggerFactory.getLogger(Scheduler.class);
    private String baseUrl = "https://cdn-api.co-vin.in/api";

    private void callAPI() {

        WebClient webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        ResponseEntity<String> responseEntity;
        try {
            responseEntity = webClient.get()
                    .uri(uriBuilder -> uriBuilder.path("/v2/appointment/sessions/public/calendarByDistrict")
                            .queryParam("district_id", 548)
                            .queryParam("date", LocalDate.now()
                                    .format(formatter))
                            .build())
                    .retrieve()
                    .toEntity(String.class)
                    .block();
        } catch (RuntimeException e) {
            String errorMessage = String.format("Unexpected error calling API: [%s]", e.getMessage());
            LOGGER.error(errorMessage, e);
            return;
        }

        if (responseEntity != null && responseEntity.getStatusCode()
                .equals(HttpStatus.ACCEPTED)) {
            LOGGER.info("Fetched data successfully: [{}]", responseEntity.getBody());
        } else {
            assert responseEntity != null;
            LOGGER.info("Error fetching data: Status: [{}], body: [{}]", responseEntity.getStatusCode(), responseEntity.getBody());
        }
    }

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        scheduler.callAPI();
    }
}
