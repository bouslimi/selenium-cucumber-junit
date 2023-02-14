package com.trigger_soft.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.trigger_soft.objectrepo.HomePage;
import com.trigger_soft.objectrepo.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

    // Scenario: Login with correct credentials

    @Given("I have a Trigger-Soft account")
    public void i_have_a_trigger_soft_account(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        System.out.println("I have a Trigger-Soft account");
    }

    @When("I login with my credentials")
    public void i_enter_my_credentials(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> dataMap = dataTable.asMaps();
        LoginPage loginPage = new LoginPage(Setup.driver);
        loginPage.login(dataMap.get(0).get("Login"), dataMap.get(0).get("Password"));
    }

    @Then("Trigger-Soft Homepage is displayed")
    public void trigger_soft_homepage_is_displayed() {
        HomePage homePage = new HomePage(Setup.driver);
        assertEquals("Homepage is not displayed!", "Trigger-Soft", homePage.getTitleText());
    }

    // Scenario Outline: Login with wrong credentials

    @Given("I do not have a Trigger-Soft account")
    public void i_don_t_have_a_trigger_soft_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter wrong (.*) and or wrong (.*)")
    public void i_enter_wrong_login_and_or_wrong_password(String login, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("An alert popup is displayed {string}")
    public void an_alert_popup_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
