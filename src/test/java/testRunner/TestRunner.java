package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\loginfeatures.feature" ,
        glue="stepdefinition"
  ,plugin = {"pretty","html:target/cucumber.html",
        "json:target/cucumber.json", "junit:target/cuckes.xml" }
     //   , tags = "@userReg"
    // , dryRun =  true


)
@Test
public class TestRunner {
}
