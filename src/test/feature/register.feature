
  Feature: Register

    @register
    Scenario: As a user I should be able to register successfully
      Given  User is on HomePage
      When User clicks on register button types in their details
      Then User should be able to register successfully


