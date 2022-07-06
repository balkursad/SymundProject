Feature: Login functionality

@UND-1164
  Scenario: User can login with valid credentials
    Given User is on Symund login Page
    When User type "Employee31" on the username box
    And User type "Employee123" on the password box
    And User click the Login button
    Then User should see the dashboard page

  @UND-1165
  Scenario Outline:User can not login with any invalid credentials
    Given User is on Symund login Page
    When User type "<username>" on the username box
    And User type "<password>" on the password box
    And User click the Login button
    Then User should see the Wrong username or password message

    Examples:
      | username     | password    |
      | employee31   | employee123 |
      | employee31   | Employee123 |
      | !'^+%&/(     | 123456789   |
      | abc'^+123    | abc'^+123   |
      | perfect      | jumping     |


  @UND-1166
  Scenario:  "Please fill out this field" message should be displayed if the password or username is empty
    Given User is on Symund login Page
    When User click the Login button
    Then User should see validation message on the password and username

  @UND-1167
  Scenario: User can see the password in a form of dots by default
    Given User is on Symund login Page
    Then user should see the password in a form of dots by default
  @UND-1168
  Scenario:  User can see the password explicitly if needed
    Given User is on Symund login Page
    And User click the eye button
    Then User should see the password explicitly
  @UND-1169
  Scenario: User can see the "Forgot password?" link on the login page
    Given User is on Symund login Page
    Then User should see the Forget Password? link
  @UND-1170
  Scenario: User can see the "Reset Password" button on the next page after clicking on forget password link
    Given User is on Symund login Page
    When User click the Forget Password? link
    Then User should see the Reset Password button
  @UND-1171
  Scenario:  User can see valid placeholders on Username and Password fields
    Given User is on Symund login Page
    Then User should see valid placeholders on Username and Password fields




