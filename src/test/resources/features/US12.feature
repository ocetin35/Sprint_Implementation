Feature:V_Track app filter accessibility and usability functionalities

  User Story:
  As a user, I want to filter customer's info on the Account Page
  Users are: sales manager, store manager


  Scenario Outline: Access to the filter customer feature on the Account Page
    Given "<user>" are on the home page
    And   user click the Accounts dropdown under the Customer link
    Then  user should be able to see below account names as filter options
      | ACCOUNT NAME  |
      | CONTACT NAME  |
      | CONTACT EMAIL |
      | CONTACT PHONE |
      | OWNER         |
      | CREATED AT    |
      | UPDATED AT    |


    Examples:
      | user          |
      | store manager |
      | sales manager |