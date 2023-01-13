Feature: Smoke test suite for opening career page on Kainos.

  @smoke @positive
  Scenario: Smoke tests for opening career page on Kainos.

    Given the client is on Kainos home page
    When the client clicks on careers
    Then the client should see the careers page


