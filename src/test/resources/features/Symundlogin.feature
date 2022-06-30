Feature: Login functionality
  @wip
  Scenario: User can login with valid credentials
    Given User is on Symund login Page
    When User type "Employee31" on the username box
    And User type "Employee123" on the password box
    And User click the Login button
    Then User should see the dashboard page