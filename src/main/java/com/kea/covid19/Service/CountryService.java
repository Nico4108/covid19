package com.kea.covid19.Service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class CountryService {

    public void getCountry(String country) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key", "0b13f56a01msh57b74741b998a36p1d3052jsn3960ea913e6b");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        String URL = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=";
        country = "Denmark";
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(URL + country, HttpMethod.GET, entity, String.class);
        System.out.println(response);
    }
}
