Feature: Ebay search
  The user searches for the product on the page

  Scenario: Entered correct user product name
    Given User navigate to main page "https://www.ebay.com"
    When  Enter product name "apple iphone 13 pro max 512gb sierra blue"
    And User press search button
    Then User enter see result page

  Scenario: Entered incorrect user product name
    Given User navigate to main page "https://www.ebay.com"
    When  Enter product name "cscdchdcndjckl"
    And User press search button
    Then User see empty result page
