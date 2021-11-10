Feature: SignIn
Scenario: User able to SignIn with valid creadential and verify the SignIn page
          
Given Users can open any browser
And Users able to enter url as "https://www.zoopla.co.uk/" 
When Users able to click the Sign In button
And  Users enter valid username as "hossain.smarttech2020@gmail.com" and password as "sazzad2020"
And Users click the Sign In button
Then Users can verify Sign In page 
And Users can close the browser 
 
