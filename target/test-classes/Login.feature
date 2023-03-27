Feature: Login Function


	
Scenario Outline:  Create a new contact scenario

Given I am in the Login  page of the Acttime application
When I enter valid User name and password credentials
Then I should be taken the Home Page
Then i should be taken the user page
Then user enters contact details "<firstname>" and "<lastname>" and "<email>"
Then view user creation succesfully message after click close 
Then Close the browser

Examples:
         | firstname        | lastname         | email                |
         | yathuppiriyaah 	| Kathirgamanathan | yathuppriyaah@gmail.com|
