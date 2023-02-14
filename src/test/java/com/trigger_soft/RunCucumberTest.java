package com.trigger_soft;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/autestbot-test-results.html"}, monochrome = true)
public class RunCucumberTest {
}
