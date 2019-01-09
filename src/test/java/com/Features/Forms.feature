Feature: Add data in Forms
Scenario: Add data in forms successfully
Given user is on forms page
When user navigate to blank form
And user enters Form titile, Form description and Question
And user adds 4 options
Then options added successfully


Scenario: Add more data in to form
Given user is on forms page
When user navigate to blank form
And user click on duplicate button
Then blank question is added
