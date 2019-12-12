Feature: feature to test login functionality

  Scenario Outline: Verify login is successful with valid credentials
    Given user is on the login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the homepage

    Examples: 
      | username | password                 |
      | Admin    | hUKwJTbofgPU9eVlw/CnDQ== |
      | Admin123 | hUKwJTbofgPU9eVlw/CnDQ== |
