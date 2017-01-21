
Feature:
  As a user
  I want to be able to add new clients in the system
  So that i can add accounting data for that client
  As a facebook user 
  I want to login and Search person name Kanika

@Signup-DataDriven
Scenario: Search Kanika in Facebook with valid user login
    Given the user is on login page of facebook
    When the user choose to login
    And he provides user id as 9916557621
    And he provides password as Fume@729nana
    And he click on submit button
    Then Successfully login
   
 
  
Scenario Outline: Data driving new user sign-up
    Given the user is on landing page
    When she chooses to sign up
    And she provides the first name as <firstName>
    And she provides the last name as <lastName>
    And she provides the email as <email>
    And she provides the password as <password>
    And she provides the confirm password again as <password>
    And she signs-up
    Then she should be logged in to the application
  
    | firstName | lastName | email             | password |
    | Sukesh    | Kumar    | validemail@aq.com | password |