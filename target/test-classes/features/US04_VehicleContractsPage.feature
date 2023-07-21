@B29G33-208
Feature: Default


  @B29G33-206
  Scenario: US04_Store managers and Sales managers access the Vehicle contracts page.
    Given user is on the login page
    Given user enters the store manager username
    Given user enters the store manager password
    Given user should click the login button
    Given user should see the dashboard
    And user should see the Vehicle Contracts under Fleet option
    And user should click the Vehicle Contracts
    And user should have an access with Vehicle Contracts page
    And user sees the expected url
			#expectedURL: https://qa.fleetgru.com/entity/Extend_Entity_VehicleContract
    Then user sees the expected title
			#expectedTitle:"All - Vehicle Contract - Entities - System - Car - Entities - System"

@SalesManager
  Scenario: US05_SalesManager
    Given user is on the login page
    Given user enters the sales manager username
    Given user enters the sales manager password
    Given user should click the login button
    Given user should see the dashboard
    And user should see the Vehicle Contracts under Fleet option
    And user should click the Vehicle Contracts
    And user should have an access with Vehicle Contracts page
    And user sees the expected url
			#expectedURL: https://qa.fleetgru.com/entity/Extend_Entity_VehicleContract
    Then user sees the expected title
			#expectedTitle:"All - Vehicle Contract - Entities - System - Car - Entities - System"


  @B29G33-207
  Scenario: US04_Drivers should NOT able to access the Vehicle contracts page, the app should display “You do not have permission to perform this action.”
    Given user is on the login page
    Given user enters the driver username
    Given user enter the driver password
    Given user should click the login button
    Given user should see the dashboard
    And user should see the Vehicle Contracts under Fleet option
    And user should click the Vehicle Contracts
    Then user should see an error message
			#expectedErrorMessage: "You do not have permission to perform this action."