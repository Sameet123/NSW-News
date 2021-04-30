Feature: Selecting and resetting a news topic
  This will test the selection and resetting of news topic on the https://www.nsw.gov.au/news website 


Background: Common Steps
Given User should be on the "https://www.nsw.gov.au/news website"

Sceanrio: Select a news topic from the accordion 
    
    And User should have clicked the Select topics accordion
    When I select the Business and Economy
    And I click on the Apply button
    Then the news item cards should be filtered based on the topics selected from the select topics accordion
     
    
Sceanrio: Resetting a news topic
    
    When I select the Business and Economy topic in the Select topics accordion
    And I click on the Reset button
    Then all the applied filters should be removed on the news items
    