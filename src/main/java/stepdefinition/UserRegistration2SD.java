package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration2SD {

    @Given("I am on add user form")
    public void i_am_on_add_user_form() {
        System.out.println("I am on add user form");
    }

    @When("^I Enter (.+) , (.+) , (.+) ,(.+)$")
    public void i_enter_(String name, String city, String phone, String email) throws Throwable {

        System.out.println(name+"\t"+city+"\t"+phone+"\t"+email);
    }

    @When("click on save button")
    public void click_on_save_button() {
        System.out.println("click on save button");
    }
    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("user should be added");
    }
}
