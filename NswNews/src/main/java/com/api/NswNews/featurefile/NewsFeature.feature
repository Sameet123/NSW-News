Feature: Selecting and resetting a news topic 
	This will test the selection and resetting of news topics on the url https://www.nsw.gov.au/news website 



Background: Common Steps for all the sceanrios 
	
	Given User should be on the url "https://www.nsw.gov.au/news website" 
	And title of login page should be "NSW Government" 
	And I will wait for page to load for "10" seconds
	And I should have clicked the Select topics accordion 
		
	
Scenario: Select a news topic from the accordion 

	When I select the Business and Economy 
	And I select the implicit wait to "10" seonds, it should wait for element till 10sec before throwing an exception 
	And I click on the Apply button 
	Then the news item cards should be filtered based on the topics selected from the select topics accordion 
	

	
Scenario: Resetting a news topic 

	When I select the Business and Economy topic in the Select topics accordion 
	And I select the implicit wait to "10" seonds, it should wait for element till 10sec before throwing an exception 
	And I click on the Reset button 
	Then all the applied filters should be removed on the news items 
    