Feature: ebay sign in
  As a registered user can enter in ebay.

  Scenario:  Entered correct user account data
    Given User navigate to main page "https://www.ebay.com"
    And User click on sign in button
    When Registered user enter valid email "bv.epam.test@gmail.com"
    And User pressed button continue
    And Registered user enter password "Aa_12345"
    And User pressed button Sign in
    Then User enter on the next page

  Scenario:  Entered  incorrect password user account data
    Given User navigate to main page "https://www.ebay.com"
    And User click on sign in button
    When Registered user enter valid email "bv.epam.test@gmail.com"
    And User pressed button continue
    And Registered user enter password "Aa_123456"
    And User pressed button Sign in
    Then User sees massage "Oops, that's not a match."