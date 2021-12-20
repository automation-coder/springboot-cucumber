package com.example.democucumber.stepdefs;

import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;


public class StepDefsTest {
    @When("^User prints (.*)$")
    public void print(String name) {
        System.out.println("Hello " + name);
    }
}
