Feature:V_Track app Oroinc Documentation Page accessibility

  User Story:
  As a user, I should be access to the Oroinc Documentation Page
  Users are: driver, sales manager, store manager

Background: For all scenarios user is on the home page of the V_Track application

  @US_2
  Scenario Outline: Access to the Oroinc Documentation Page
    Given "<user>" are on the home page
    When  click the question icon on the right top of the homepage
    Then  "<user>" should be able to access to the Oroinc Documentation Page

    Examples:
      | user          |
      | driver        |
      | store manager |
      | sales manager |