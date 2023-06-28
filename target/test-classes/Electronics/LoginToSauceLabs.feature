@Login
Feature: To validate the login feature

Background: Background to all scenarios
			Given User has entered sauce labs URL


@smoke  @creditrcard
Scenario: TC1 To verify user is able to login to sauce labs using correct Un and Pw

     
    When User hits enter to load URL
    Then User lands on Sign In page of SL
    
 @Sanity @debitcard
Scenario: TC2 To verify user is able to login to sauce labs using correct Un and Pw

    
    When User hits enter to load URL
    Then User lands on Sign In page of SL
   
   @Regression @creditrcard
   Scenario: TC3 To verify user is able to login to sauce labs using correct Un and Pw

    
    When User hits enter to load URL
    Then User lands on Sign In page of SL
    
   @Regression @creditrcard
   Scenario: TC4 To verify user is able to login to sauce labs using correct Un and Pw

    
    When User hits enter to load URL
    Then User lands on Sign In page of SL
   