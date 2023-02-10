Feature: Smoke test suite on career page functionality on Kainos.

  @smoke @positive
  Scenario: Smoke test for opening career page on Kainos.

    Given the user is on Kainos home page
    When the user navigates to the Careers page
    Then the user should see the careers page



