Feature: Application Login

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "jin" and "1234"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and "4321"
    Then Home page is populated
    And Cards displayed are "false"

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
    | jenny | abcd | test@test.com | Brazil | 12345 |
    Then Home page is populated
    And Cards displayed are "false"

  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login in to application with user <username> and pwd <password>
    Then Home page is populated
    And Cards displayed are "true"

    Examples:
    | username  | password  |
    | username1 | password1 |
    | username2 | password2 |
    | username3 | password3 |
    | username4 | password4 |


