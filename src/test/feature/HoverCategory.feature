Feature: Hover in Category

 @hovercategory
  Scenario: User should be able to hover and go to Computers and verify colour

    Given I am on homepage
    When I hover to "Computers" category
    Then I should be able to verify the colour change
   And I should be able to click on SubCategory "Notebooks"

