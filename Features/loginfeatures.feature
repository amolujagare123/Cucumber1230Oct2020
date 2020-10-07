Feature: Login page validations

  Scenario: Login check with valid username and password
    Given I am on login page
    When I enter username and password
    And I click on submit
    Then  System has to throw an error message