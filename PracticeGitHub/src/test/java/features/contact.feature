Feature: As a user i want a customer service phone number so that i can 
         get assistance if needed

Scenario: user should be able to view business contact information
Given a user
When user goes to dell website
And navigates to support
And enters contact us page
Then contact information page should display