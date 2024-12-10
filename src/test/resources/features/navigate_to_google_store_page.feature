Feature: Google Navigation for store

  Scenario: Navigate to Google Store Page
    Given I am on the google page
    When I click on store button
    Then I should see store page
    When I click on earbuds page
    Then I should see the earbuds page
