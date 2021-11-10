Feature: SignIn
@amazon
Scenario: User able to SignIn with valid creadential and verify the SignIn page
     
Given Users can open any browser
And Users able to enter url as "https://www.amazon.com/" 
When Users able to click the sell button
Then Users can close the browser
