Feature: Hotel bookings application

Scenario Outline:: Login module in adactin application
Given user launch adactin application
When user enter "<username>" in username field
And user enter "<password>" in password field
Then user clicks login button

Examples:
|username           |password|                  
|abishek@23         |123456  |
|abishek@12         |098765  |







Scenario: searching for a hotel
When  user select Location
And user select Hotels
And user select Roomtype
And  user select NumberRooms
And user select Log in
And user select Log out
And user select Adultsper Room
And user select Childrenper Room
Then click Search

Scenario: select Hotel
When user click the selected hotel
Then user click the continue

Scenario: Book a hotel
When user enter firstname in firstname field
And user enter lastname in lastname field
And user enter billing address in field name
And user enter card number in card number field
And user enter card type in card type field
And user enter expiery month in field
And user enter expiery year in field
And user enter cvv number infield
Then user click book now

Scenario: Booking confirmation
Then user click the itinerary 

Scenario: Book itinerary
Then user click the logout button



