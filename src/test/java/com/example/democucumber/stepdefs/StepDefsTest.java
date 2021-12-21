package com.example.democucumber.stepdefs;

import com.example.democucumber.commons.RestClient;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDefsTest {

    @Autowired
    RestClient restClient;

    @When("^User prints (.*)$")
    public void print(String name) {
        System.out.println("Hello " + name);
        System.out.println(restClient.getString());
    }
}
