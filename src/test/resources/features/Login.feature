Feature:


  @vytrackLogin
  Scenario: Login as driver
    Given user is on the login page
    When user enters the driver information
    Then user should be able to login