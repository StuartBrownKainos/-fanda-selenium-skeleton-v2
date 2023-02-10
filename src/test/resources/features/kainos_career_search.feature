Feature: Smoke test suite on career page search functionality.

  @smoke @positive
    Scenario: Smoke test on searching an engineering role

      Given the user is on the Careers page
      When the user navigates to the the opportunities related to test
      Then the user can see all results relating to test


