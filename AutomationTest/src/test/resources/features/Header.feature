@header
Feature: Check UI screen including full header

  Scenario: Check screen header
    Given I am go to page
    When Click on Features redirect to the Features screen
    And Click on the drop-down Ecosystem to display the list of values inside
    And Click drop-down Why Shopbase to display the list of values inside
    And Click on the text link Templates displays the Templates screen
    And Click on drop down Resources show list value in select box
    And Click on the Pricing
    Then Click login button Redirect to login screen
    And Click the Start 14-day free trial button goes to the Art your free 14-day trial of ShopBase screen

