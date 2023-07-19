
Feature: Default


  @B29G33-199
  Scenario: As a Store manager, I want to see edit car info icons from the Vehicle page - Test Case
Feature: Fleet mng
Given the Store manager is already on the homepage
When the Store manager clicks on "Vehicles" under the Fleet
Then the Store manager should verify that any car info has 3 dots and there are "view, edit,delite" icons


  @B29G33-200
  Scenario: As a Sales manager, I want to see edit car info icons from the Vehicle page - Test Case3
Feature: Fleet mng
Given the Sales manager is already on the homepage
When the Sales manager clicks on "Vehicles" under the Fleet
Then the Sales manager should verify that any car info has 3 dots and there are "view, edit,delite" icons


  @B29G33-201
  Scenario: As a Truck driver, I want to see edit car info icons from the Vehicle page - Test Case2
Feature: Fleet mng
Given user is on the login page
When user enters the driver information
Then user should be able to login
When the Truck driver clicks on "Vehicles" under the Fleet
Then Verify that car info has Icons after hover over three dots