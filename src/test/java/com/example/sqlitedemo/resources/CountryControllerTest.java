package com.example.sqlitedemo.resources;

import com.example.sqlitedemo.domain.Country;
import com.example.sqlitedemo.service.CountryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.test.web.servlet.MockMvc;
import org.w3c.dom.stylesheets.LinkStyle;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CountryControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void readAllCountries() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/regex").toString(), String.class);
                assertNotNull(response.getBody());
                assertNotSame("[]", response.getBody());

    }







}