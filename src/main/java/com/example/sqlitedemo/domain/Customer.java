package com.example.sqlitedemo.domain;

import javax.persistence.*;

@Entity
public class Customer {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
 
    private String name;
 
    private String phone;

    private Boolean state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public Boolean getState() { return state; }

    public void setState(Boolean state) { this.state = state;}

    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
}