
Feature: Title of your feature
  I want to use this template for my feature file
Background: Background to all scenarios
			Given User has entered sauce labs URL


  @SingleList
  Scenario Outline: Passing values through example keywords
    When User hits enter to load URL
    Then User lands on Sign In page of SL
		When User enters below credentials 
		|Sagar|
		|Swapnil|
		|Tanushree|
		|Priyanka|
		|Shital|
    Then I logged in to sauce labs
    
@MultipleCellsList
  Scenario Outline: Passing values through example keywords
    When User hits enter to load URL
    Then User lands on Sign In page of SL
		When User enters below credentials Multiple cells
		|Sagar|Nagpur|56|
		|Swapnil|Pune|23|
		|Tanushree|London|28|
		|Priyanka|Texas|26|
		|Shital|Berlin|27|
    Then I logged in to sauce labs