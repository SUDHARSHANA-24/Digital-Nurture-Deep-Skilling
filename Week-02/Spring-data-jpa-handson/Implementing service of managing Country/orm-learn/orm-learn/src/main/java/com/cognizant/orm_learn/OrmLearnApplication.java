package com.cognizant.orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

    	ApplicationContext context =
    	        SpringApplication.run(OrmLearnApplication.class, args);

    	countryService = context.getBean(CountryService.class);

    	
    	testFindCountry();
    	testAddCountry();
    	testDeleteCountry();
    	testSearchCountry();
    }

    private static void testFindCountry() {
    	System.out.println("************ FIND COUNTRY ************");

        Country country = countryService.findCountryByCode("IN");

        System.out.println("Country Code : " + country.getCode());
        System.out.println("Country Name : " + country.getName());

        System.out.println("*************************************");
    }
    private static void testAddCountry() {

        System.out.println("\n========== ADD COUNTRY ==========");

        Country country = new Country();

        country.setCode("NP");
        country.setName("Nepal");

        countryService.addCountry(country);

        System.out.println("Country Added Successfully!");

        System.out.println("===============================");
    }
    private static void testDeleteCountry() {

        System.out.println("\n========== DELETE COUNTRY ==========");

        countryService.deleteCountry("XX");

        System.out.println("Country Deleted Successfully");

        System.out.println("====================================");
    }
    private static void testSearchCountry() {

        System.out.println("\n========== SEARCH COUNTRY ==========");

        List<Country> countries = countryService.searchCountries("Uni");

        for (Country country : countries) {
            System.out.println(country);
        }

        System.out.println("====================================");
    }
}