package com.example.democucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@CucumberOptions(
        features = "classpath:features/",
        //glue = "classpath:com.example.democucumber.stepdefs",
        plugin = {
                "summary",
                "html:target/cucumber/html/report.html"
        }, monochrome = true, stepNotifications = true,
        tags = ""
)
public class RunnerTest {
}
