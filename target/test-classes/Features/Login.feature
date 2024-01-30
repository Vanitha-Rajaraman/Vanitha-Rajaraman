Feature: Facebook Login

  Background:
    Given Launch the browser
    And   Open the application
  @1
  Scenario Outline: Login Scenario with Valid Cred

    When  User Enters the "<username>" and "<password>"
    Then  Click the login button
    Then Validate the error "<message>"

    Examples:
      | username | password       |message|
      | John     | 12345          |Forgotten password?|
      | Mr.X     | shbdeuhfueffru |Find your account and log in.|

    #Ctrl+alt+L - Alignment correction