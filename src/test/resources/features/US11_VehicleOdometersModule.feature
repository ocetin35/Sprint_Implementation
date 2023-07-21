@B29G33-232
Feature: Default


  @B29G33-228
  Scenario: Store manager should see an error message “You do not have permission to perform this action.”  when they click the “Vehicle Odometer” module.
    Given Store manager is on the Fleet management home page
    When  Store manager clicks on Fleet Module
    And   Store manager clicks on Vehicle Odometer
    Then  Store manager should see an error message

  @B29G33-229
  Scenario: Sales manager should see an error message “You do not have permission to perform this action.”  when they click the “Vehicle Odometer” module.
    Given Sales manager is on the Fleet management home page
    When  Sales manager clicks on Fleet Module
    And   Sales manager clicks on Vehicle Odometer
    Then  Sales manager should see an error message


  @B29G33-230
  Scenario:  Drivers should see the default page as 1
    Given Driver is on the Fleet management home page
    When Driver clicks Fleet Module
    And Driver clicks clicks on Vehicle Odometer
    Then Driver should see default page as 1


  @B29G33-231
  Scenario: Divers should see the View Per Page is 25 by default.
    Given Driver is on the Fleet management home page
    When Driver clicks Fleet Module
    And Driver clicks clicks on Vehicle Odometer
    Then Driver should see the View Per Page is 25 by default