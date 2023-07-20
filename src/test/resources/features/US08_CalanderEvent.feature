@B29G33-212
Feature: Default

	#User Story: As a user, I want to create a recurring calendar event.

	Background:
		Given Users are on the homepage
		And user enters valid credentials
		And user hover-over "Activities" on main modules
		When They click "Calendar Events" under the Activities
		And They move to the right corner over Create Calendar Event
		And They click the "Create Calendar event" button
		And They check the "Repeat" checkbox
	@B29G33-211
	Scenario: user should see the number “1” by default in the Repeat Every input. 
		Scenario: Default Repeat Value
			#Given Users are on the homepage
			#When They click "Calendar Events" under the Activities
			#And They click the "Create Calendar Event" button
			#And They check the Repeat checkbox
		    Then They should see the number "1" by default in the Repeat Every input.

	
	@B29G33-210
	Scenario: user see an error message when repeat field is cleared
		Scenario: Error Message When Clearing Repeat Field
		#Given Users are on the homepage
		#When They click "Calendar Events" under the Activities
		#And They click the "Create Calendar Event" button
		#And They check the Repeat checkbox
		And They clear (delete) the number 1
		Then They should see an error message "This value should not be blank."