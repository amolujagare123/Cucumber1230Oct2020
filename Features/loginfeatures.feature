Feature: Login page validations


  Background: before you open the url
    Given  browser is opened
    And it is maximized


  Scenario: Login check with valid username and password
    Given I am on login page
    #When I enter username and password
    When I enter "admin" and "admin"
    And I click on submit
    Then  we should be on home


  Scenario: Login check with invalid username and password
    Given I am on login page
    #When I enter invalid username and password
    When I enter "dsdsd" and "sdsd"
    And I click on submit
    Then  System has to throw an error message

  Scenario: Login check with blank username and password
    Given I am on login page
    #When I keep username and password blank
    When I enter "" and ""
    And I click on submit
    Then  System throws another error message

    @registration
    Scenario: user registration
      Given I am on user registration page
      When I enter following
      | amol | ujagare | amol@gmail.com | 787887 |
      Then user is added


      @userReg
      Scenario Outline: add user form
        Given  I am on add user form
        When I Enter <name> , <city> , <phone> ,<email>
        And click on save button
        Then user should be added

        Examples:

        | name     | city       | phone   | email              |
        | amol     | pune       | 898659  | amol@gmail.com     |
        | deepak   | banglore   | 548989  | deepak@gmail.com   |
        | Abhishek | pune       | 89859   | abhi@gmail.com     |
        | priyanka | Ahmednagar | 28989   | priyanka@gmail.com |
