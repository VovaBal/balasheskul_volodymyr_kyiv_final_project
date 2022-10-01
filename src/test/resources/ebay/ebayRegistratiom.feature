Feature: ebay registration
  As a guest I should able to sign up into ebay.

  Scenario: Guest entered correct user registration data
    Given User navigate to main page "https://www.ebay.com"
    And User click on sign up button
    When User enter valid first name "Володимир"
    And User enter valid last name "Балашескул"
    And User enter valid email "bv.epam.test@gmail.com"
    And User enter valid password "Aa_12345"
    Then create account button is "active"

  Scenario: Guest entered incorrect email while registration
    Given User navigate to main page "https://www.ebay.com"
    And User click on sign up button
    When User enter valid first name "vova"
    And User enter valid last name "vova2"
    And User enter valid email "bv.epam.test@gmail,com"
    And User enter valid password "Aa_12345"
    Then create account button is "not active"

