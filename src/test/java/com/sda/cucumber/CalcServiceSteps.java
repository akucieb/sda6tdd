package com.sda.cucumber;

import com.sda.CalcService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalcServiceSteps {

    private String text;
    private int actual;
    private CalcService calcService;

    @Given("^I initialize CalcService$")
    public void I_initialize_CalcService() {
        calcService = new CalcService();
    }

    @And("^I pass (.*) value to compute$")
    public void I_pass_text_value_to_compute(String text) {
        this.text = text;
    }

    @And("^I pass null$")
    public void I_pass_null() {
        text = null;
    }

    @And("^I pass blank$")
    public void I_pass_blank() {
        text = "";
    }

    @When("^I execute calculate method$")
    public void I_execute_calculate_method() {
        actual = calcService.calculate(text);
    }

    @Then("^I get (.*) as a result$")
    public void I_get_value_as_a_result(int result) {
        Assert.assertEquals(result, actual);
    }

}
