Feature: Adactin Hotel App Booking
@loginpage
Scenario: Login Page
Given user Launch The Application
When user Enters The Username
And user Enters The Password
Then user Clicks The LoginButton then Its Navigate To SearchHotelPage

@searchhotelpage
Scenario: Search Hotel Page
When user Selects Hotel Location
And user Selects Hotel
And user Selects RoomType
And user Selects NoOfRooms
And user Enters CheckInDate
And user Enters CheckOutDate
And user Selects AdultsPerRoom
And user Selects ChildrenPerRoom
Then user Clicks On The SearchButton then Its Navigate To SelectHotelPage

@selecthotelpage
Scenario: Select Hotel Page
When user Clicks On The RadioButton
Then user Clicks The ContinueButton then Its Navigate To BookAHotelPage

@bookahotelpage
Scenario: Book A Hotel Page
When user Enters The FirstName
And user Enters The LastName
And user Enters The BillingAddress
And user Enters The CreditCardNumber
And user Enters The CreditCardType
And user Enters The CardExpiryMonthandYear
And user Enters The CVVNumber
Then user Clicks On BookHotelButton