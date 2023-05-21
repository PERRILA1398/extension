Feature: Category
  @category
  Scenario Outline: Category feature

    Given I am on Demo nopcommerce homepage
    When I click on "<button_name>"button
    Then I should be able to verify that I am navigated to the "<page_url>"
    And I should verify th page title as "<page_title>"

    Examples:
     |button_name |page_url|page_title|

    | Computers | https://demo.nopcommerce.com/computers | Computers |
    |Electronics |https://demo.nopcommerce.com/electronics|Electronics|
    |Apparel     |https://demo.nopcommerce.com/apparel | Apparel      |
    |Digital downloads| https://demo.nopcommerce.com/digital-downloads| Digital downloads|
    |Books            |https://demo.nopcommerce.com/books             | Books            |
    |Jewelry          |https://demo.nopcommerce.com/jewelry           | Jewelry          |
    |Gift Cards       |https://demo.nopcommerce.com/gift-cards        |Gift Cards |