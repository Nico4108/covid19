package com.kea.covid19;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication
public class Covid19Application{

    public static void main(String[] args) {
        SpringApplication.run(Covid19Application.class, args);
    }


    /*@Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key", "0b13f56a01msh57b74741b998a36p1d3052jsn3960ea913e6b");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String URL = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=Denmark";
        //country = "Denmark";
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(URL, HttpMethod.GET, entity, String.class);
        System.out.println(response);
    }*/
}
