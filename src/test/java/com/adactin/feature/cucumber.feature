Feature: Login functionality for Adactin application

Scenario: user enter valid username and valid password
			Given user launch application
			When user enter "Atheeshwar" as username
			And user enter "testing123" as password
			Then user verify valid username and password
			
Scenario: user enter valid search hotel details
			Given user select "New York" as location
			When user select "Hotel Sunshine" as hotel
			And user select "Double" as roomtype
			And user select "2 - Two" as number of rooms
			And user clear checkin date
			And user enter "22/04/2021" as checkin date
			And user clear checkout date
			And user enter "23/04/2021" as checkout date	
			And user enter "2 - Two" as adults per room
			And user enter "1 - One" as child per room
			Then user verify valid seatch hotel details		