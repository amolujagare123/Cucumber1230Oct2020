package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("I am on login page");
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("I enter username and password");
    }
    @When("I click on submit")
    public void i_click_on_submit() {
        System.out.println("I click on submit");
    }

    @Then("System has to throw an error message")
    public void system_has_to_throw_an_error_message() {
        System.out.println("System has to throw an error message");
    }
}
