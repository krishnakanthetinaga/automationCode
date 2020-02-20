Feature: select first product on the page
  @regression

  Scenario: find product on homepage
    Given i am on homepage
    When I enter a location
    Then I view results of the selected location