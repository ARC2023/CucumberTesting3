
Feature: Data Driven testing
  Background: Background to all scenarios
			Given User has entered sauce labs URL

  @Param
  Scenario: Passing hard coded values
    When User hits enter to load URL
    Then User lands on Sign In page of SL
    When I enter UN as "standard_user"
    And I enter PW as "secret_sauce" 
    Then I logged in to sauce labs
    

  @DataDriven
  Scenario Outline: Passing values through example keywords
    When User hits enter to load URL
    Then User lands on Sign In page of SL
    When I enter UN as "<UN>"
    And I enter PW as "<PW>" 
    Then I logged in to sauce labs

    Examples: 
     | UN            |     PW           |
     | standard_user |     secret_sauce |
     | problem_user  |     secret_sauce |
     | standard_user |     secret_sauce |
     | problem_user  |     secret_sauce |
     | standard_user |     secret_sauce |
     | problem_user  |     secret_sauce |
     | standard_user |     secret_sauce |
     | problem_user  |     secret_sauce |
     