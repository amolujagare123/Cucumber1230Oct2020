package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;


public class LoginStepDefinitions {

    @Given("browser is opened")
    public void browser_is_opened() throws Throwable {
        System.out.println("browser is opened");
    }

    @And("it is maximized")
    public void it_is_maximized() throws Throwable {
        System.out.println("it is maximized");
    }


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
        Asserts.check(false,"this is message");

    }

    @Then("we should be on home")
    public void we_should_be_on_home() {
        System.out.println("we should be on home");

    }



    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_password() {
        System.out.println("I enter invalid username and password");
    }



    @When("I keep username and password blank")
    public void i_keep_username_and_password_blank() {
        System.out.println("I keep username and password blank");
    }


    @Then("System throws another error message")
    public void system_throws_another_error_message() {
        System.out.println("System throws another error message");

    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {

        System.out.println("----username:"+username+" ----- Password:"+password);
    }

}
