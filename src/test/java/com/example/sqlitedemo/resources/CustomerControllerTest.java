package com.example.sqlitedemo.resources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void info() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/info").toString(), String.class);
        assertNotNull(response.getBody());
        assertNotSame("[]", response.getBody());

    }

}