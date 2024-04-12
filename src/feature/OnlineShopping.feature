Feature: Menu Options
    As a user
    I want to see the menu options
    So that I can navigate through the application

    Scenario: Revealing menu options
        Given I am on the homepage
        When enter 'standard_user' and 'secret_sauce'
        And click on the login button
        And I click on the menu button
        Then I should see the following options:
            | Option           |
            | All Items        |
            | About            |
            | Logout           |
            | Reset App State  |
       

    Scenario: Adding product to cart
        Given I am on the homepage
        When I search for "Sauce Labs Backpack"
        And I select the product
        And I add it to my cart
        Then the product should be added successfully

    Scenario Outline: Adding product to cart with shipping details
        Given I am on the homepage
        When I search for "<product>"
        And I select the product
        And I add it to my cart
        Then the product should be added successfully

        Examples:
            | product                 |
            | Sauce Labs Backpack     |
            | Sauce Labs Bolt T-Shirt |
            | Sauce Labs Onesie       |
            | Test.allTheThings() T-Shirt (Red) |
            | Test.allTheThings() T-Shirt (Green) |
            | Test.allTheThings() T-Shirt (Blue)  |


    Scenario: Sorting products by name 
        Given I am on the homepage
        When I select the "Name (A to Z)" sorting option
        And  I select the "Name (Z to A)" sorting option
        And I select the "Price (low to high)" sorting option
        And I select the "Price (high to low)" sorting option
        Then the products should be sorted in ascending order by name

    