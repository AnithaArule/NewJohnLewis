@smoke
Feature: Smoke test pack for john lewis


  Scenario: check the home page is displayed with options

    Given user open a browser
    When open the ham burger menu
    Then I should see the following option
      | link | Home                 |
      | link | Browse by Department |
      | link | Partnership Card     |
      | link | Download our App     |
      | link | Contact Us           |
    When close the ham burger menu
    Then I should see the following option
    |button|Sign up               |


    Scenario Outline: User can find store

      Given user open a browser
      When he open an all the shops
      Then the branch "<Branch>" should be shown
      And he opens the branch
      Then the details of the branch should be shown

      Examples:
      |Branch|
      |Glasgow|

    @temp

      Scenario: Check item can be added to the basket

        Given user is in home page
        When I search for "Computers"
        And added an item to the basket with title "Buy HP Envy 15-AE002NA Laptop PC, Intel Core i7, 12GB RAM, 256GB,15.6"
        Then an item should be available in basket

@SpecialOffers
  Scenario Outline:check user can add a product from special offers
        Given user is in home page
        Given user is in special offers page
        When user selects "<CategoryList>"
        And user added an item from the productList "<Product>"
        Then the Product should be added to basket
    Examples:

  |CategoryList|  |Product|
  |Computing Offers| |HP Envy 17-k206na Laptop, Intel Core i7, 16GB RAM, 1TB + 8GB SSD, 17.3", Silver |

  @SportsLeisure
  Scenario Outline: check user can add a product from Sport&Leisure
        Given User is in home Page
        When user selects Sports&Leisure
        When user selects an item"<SportCategoryList>"
        When user added an item from "<SportsProduct>"
        Then the Sports Product should be added to basket
    Examples:
     |SportCategoryList|                  |SportsProduct  |
      |Badminton & Squash         ||Yonex Nanoray 20 Badminton Racquet, White/Red|













