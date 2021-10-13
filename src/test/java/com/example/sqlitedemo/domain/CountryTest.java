package com.example.sqlitedemo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountryTest {

    @Test
    void equalsVerifier() throws Exception {
        Country country1 = new Country();
        country1.setId(5);
        Country country2 = new Country();
        country2.setId(country1.getId());
        assertThat(country1).isEqualTo(country1);
        country2.setId(2);
        assertThat(country1).isNotEqualTo(country2);
        country1.setId(null);
        assertThat(country1).isNotEqualTo(country2);

    }

}