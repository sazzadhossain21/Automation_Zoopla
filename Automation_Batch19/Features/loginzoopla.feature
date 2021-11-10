Feature: Sign In
@TS_001
@SmokeTest
Scenario: User able to Sign In with valid credential and verify the home page
Given Users can open any browser
And Users able to enter url as "https://www.zoopla.co.uk/"
When Users able to click Sign In button
And Users enter valid username as "hossain.smarttech2020@gmail.com" and password as "sazzad2020" 
And Users click the Sign In button
Then Users can verify Sign In page
And Users can close the browser
@TS_002
@NegativeTest
Scenario Outline: User able to Sign In with valid credential and verify the home page
Given Users can open any browser
And Users able to enter url as "https://www.zoopla.co.uk/"
When Users able to click Sign In button
And Users enter valid username as "<username>" and password as "<pwd>" 
And Users click the Sign In button
Then Users can verify Sign In page
And Users can close the browser

Examples:
|username                          |    pwd   |
|hossain.smarttech2020@gmail.com|sazzad2020|
|hossain.smarttech2020@gmail.com|sazzad2021|
|hossain.smarttech2021@gmail.com|sazzad2020|




 

