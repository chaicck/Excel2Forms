Feature: Login
Scenario: Successful login
Given user is on home page
When user navigate to Login page
And user enters UserName and Password
Then Logged in successfully