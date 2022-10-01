Feature: Filtered in menu

  Scenario: User uses a filter in the menu
    Given User navigate to main page "https://www.ebay.com"
    When  Enter product name "apple iphone 13 pro max sierra blue"
    And User press search button
    And User press buy it now button
    And User clicks on the 1 TB filter
    Then User sees that in the name of each product contains 1 TB

  Scenario: User opens all categories in the menu
    Given User navigate to main page "https://www.ebay.com"
    And User click on sign in button
    And  Registered user enter valid email "bv.epam.test@gmail.com"
    And User pressed button continue
    And Registered user enter password "Aa_12345"
    And User pressed button Sign in
    When User click shop by category
    And User click see all categories
    Then User sees header All categories