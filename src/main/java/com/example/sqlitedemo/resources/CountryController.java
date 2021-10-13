package com.example.sqlitedemo.resources;
import com.example.sqlitedemo.domain.Country;
import com.example.sqlitedemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @CrossOrigin
    @RequestMapping(value = "countries", method = RequestMethod.GET)
    public Iterable<Country> gestaltCountries(){ return countryService.realAllCountry();}

    @CrossOrigin
    @RequestMapping(value = "countries", method = RequestMethod.POST)
    public String createCountry(@RequestBody Country country){
        return countryService.createCountry(country);
    }

}
