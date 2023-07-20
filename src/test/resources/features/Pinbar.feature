
@B29G33-194
Feature: Default



  @B29G33-192
  Scenario: How to use the Pinbar
    Given user is on the login page
    When user enters the driver information
    Then user should be able to login
    And User clicks on any page on the home page
    When User clicks on the Pinbar icon
    Then User sees desired page highlighted in the header section in yellow


  @B29G33-193
  Scenario: User should verify image source of the image
    Given User is on the homepage
    When User hovers on that specific page
    Then User sees expected image source
