Feature:

@B29G33-229-driver
Scenario: Writing Description in Calendar Event as a driver.
Given user is on the login page
When user enters the driver information
Then user should be able to login
And user should be open enter the Calendar Events page
Then Calendar events page title should be "Calendar Events - Activities"
And user should be open the Calender Event page
Then user should be enter Title
And user should be enter description
Then user should be able to save and close