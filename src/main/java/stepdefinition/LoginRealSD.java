package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRealSD {



   /* WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() throws Throwable {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net");

    }

    @When("I enter username and password")
    public void i_enter_username_and_password() throws Throwable {

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

    }

    @Then("System has to throw an error message")
    public void system_has_to_throw_an_error_message() throws Throwable {
        System.out.println("Then result : sucess/failure");
    }

    @And("I click on submit")
    public void i_click_on_submit() throws Throwable {

        driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
    }
*/
}
