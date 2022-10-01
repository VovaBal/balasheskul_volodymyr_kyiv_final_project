Feature: Add to shop cart
  The user add a product to shop cart

  Scenario: Entered correct user product name
    Given User navigate to main page "https://www.ebay.com"
    When  Enter product name "apple iphone 13 pro max 512gb sierra blue"
    And User press search button
    And User press buy it now button
    And User select product from list
    And User press add to cart button
    Then User enter to shop cart page


  Scenario: Entered correct user product name
    Given User navigate to main page "https://www.ebay.com"
    When  Enter product name "apple iphone 13 pro max 512gb sierra blue"
    And User press search button
    And User press buy it now button
    And User select product from list
    And User press add to cart button
    And User click on product in shop cart
    Then User see button view in cart
