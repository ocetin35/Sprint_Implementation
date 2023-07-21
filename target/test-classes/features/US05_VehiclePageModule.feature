@B29G33-205
Feature: Default

	
	@B29G33-203
	Scenario: US05AC01TC01 Verify store manager should see expected columns on the Vehicle Model page
		Given Store manager is on the Fleet management home page
		   When  Store manager clicks on Fleet Module
		   And   Store manager clicks on Vehicles Model Module
		   Then  Store manager should see expectedColumnNames

			   |MODEL NAME|
			   |MAKE|
			   |CAN BE REQUESTED|
			   |CVVI|
			   |CO2 FEE (/MONTH)|
			   |COST (DEPRECIATED)|
			   |TOTAL COST (DEPRECIATED)|
			   |CO2 EMISSIONS|
			   |FUEL TYPE|
			   |VENDORS|

	Scenario: US05AC01TC02 Verify sales manager should see expected columns on the Vehicle Model page
		   Given Sales manager is on the Fleet management home page
		   When  Sales manager clicks on Fleet Module
		   And   Sales manager clicks on Vehicles Model
		   Then  Sales manager should see expectedColumnNames
		   |MODEL NAME|
		   |MAKE|
		   |CAN BE REQUESTED|
		   |CVVI|
		   |CO2 FEE (/MONTH)|
		   |COST (DEPRECIATED)|
		   |TOTAL COST (DEPRECIATED)|
		   |CO2 EMISSIONS|
		   |FUEL TYPE|
		   |VENDORS|


	@B29G33-204
	Scenario: US05AC02TC01 Verify drivers should not able to access the Vehicle Model page, and should see “You do not have permission to perform this action.”
		Given Driver is on the Fleet management home page
		  When Driver clicks Fleet Module
		  And Driver clicks Vehicles Model Module
		  Then Driver should see error message