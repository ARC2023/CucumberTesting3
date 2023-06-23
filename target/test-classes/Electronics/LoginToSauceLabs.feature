Feature: To validate the login feature

Scenario: To verify user is able to login to sauce labs using correct Un and Pw

    Given User has entered sauce labs URL 
    When User hits enter to load URL
    Then User lands on Sign In page of SL
    
