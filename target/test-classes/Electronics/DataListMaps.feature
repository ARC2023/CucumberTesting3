
Feature: Title of your feature
  I want to use this template for my feature file
Background: Background to all scenarios
			Given User has entered sauce labs URL


  @SingleList
  Scenario: Passing values through Data table as single list
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
  Scenario: Passing values through Data table as list of list
    When User hits enter to load URL
    Then User lands on Sign In page of SL
		When User enters below credentials Multiple cells
		|Sagar|Nagpur|56|
		|Swapnil|Pune|23|
		|Tanushree|London|28|
		|Priyanka|Texas|26|
		|Shital|Berlin|27|
    Then I logged in to sauce labs
    
    
   @ListOfMap
  Scenario: Passing values through Data table as list of Maps
    When User hits enter to load URL
    Then User lands on Sign In page of SL
		When User enters below credentials Multiple cells in maps
		|UN|EMAIL|CITY|PINCODE|
   |Amruta|Amruta@gmail.com|Nagpur|987456|
   |Bhagyashree|Bhagyashree@gmail.com|Pune|654789|
   |Priya|Priya@gmail.com|Mumbai|123654|
   |Nikhil|Nikhil@gmail.com|Banglore|456258|
    Then I logged in to sauce labs
     
    
    
    
    
    