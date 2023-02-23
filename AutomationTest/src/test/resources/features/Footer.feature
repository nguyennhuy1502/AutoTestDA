Feature: Check UI screen including full Footer
  Background:
    Given I am go to page

  Scenario Outline: Check full screen Footer
    When I am go to Footer
    And I am check <FEATURES>
    And I am check <SHOPBASE>
    And I am check <LEARN & GET HELP>
    Examples:
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | Storefront | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
      | FEATURES   | SHOPBASE | LEARN & GET HELP|
