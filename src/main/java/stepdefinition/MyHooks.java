package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

    @Before("@registration")
    public void mymethod1()
    {
        System.out.println("inside the before Hook");
    }


    @After("@registration")
    public void mymethod2()
    {
        System.out.println("inside the after Hook");
    }

}
