package com.trigger_soft.steps;

import io.cucumber.java.en.When;


public class CommonSteps {

    // Common Test Steps

    @When("I visit Trigger-Soft Webapp")
    public void i_visit_trigger_soft_webapp() {
        Setup.driver.get("http://localhost:8080/");
    }

}
