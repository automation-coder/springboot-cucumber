package com.example.democucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        publish = true,
        plugin = {
                "pretty",
                "html:target/cucumber/html/report.html"
        },
        extraGlue = "com.example.democucumber.config"
)
public class RunnerTest {
}
