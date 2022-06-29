Feature: Logout functionality
@UND-1117
  Scenario: Symund Logout Functionality Verification
    Given User is on Symund dashboard page
    When User click on the profile button
    And User click on the Log out button
    Then User should see the login page
  @UND-1119
    Scenario: After Logout do not navigate to back Verification
      Given User is on Symund dashboard page
      When User click on the profile button
      And User click on the Log out button
      And User click the back button
      Then User should stay login page

