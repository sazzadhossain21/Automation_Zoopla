Feature: Users can login the application with valid credential and verify the page title

Scenario Outline: user can 
Given Users can open any browser
And Users able to enter url as "<url>" 
When Users able to click the Sign In button
And  Users enter valid username as "<username>" and password as "<password>"
And Users click the Sign In button
Then Users can verify Sign In page 
And Users can close the browser
 
 Examples:
 |username                |password      |url                     |
 |alammohammed79@gmail.com|SAYEDawan2008@|http://www.zoopla.co.uk/|
 |alammohammed79@gmail.com|SAYEDawan2008 |http://www.zoopla.co.uk/|
 |alammohammed@gmail.com  |SAYEDawan2008@|http://www.zoopla.co.uk/|