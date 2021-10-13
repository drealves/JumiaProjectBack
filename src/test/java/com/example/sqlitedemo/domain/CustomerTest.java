package com.example.sqlitedemo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void equalsVerifier() throws Exception {
        Customer customer1 = new Customer();
        customer1.setId(5);
        Customer customer2 = new Customer();
        customer1.setId(customer1.getId());
        assertThat(customer1).isEqualTo(customer1);
        customer1.setId(2);
        assertThat(customer2).isNotEqualTo(customer1);
        customer1.setId(null);
        assertThat(customer2).isNotEqualTo(customer1);
    }

}