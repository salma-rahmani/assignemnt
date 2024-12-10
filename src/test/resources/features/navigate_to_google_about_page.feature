Feature: Google Navigation

  Scenario: Navigate To Google About Page
    Given I am on the google web page
    When I click on about button
    Then I should see the about page
    When I click on commitment button
    Then I should see the commitment page
