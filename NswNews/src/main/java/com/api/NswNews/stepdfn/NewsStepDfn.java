package com.api.NswNews.stepdfn; // package declared

//Import the java utilities
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.*;

		

public class NewsStepDfn {
				
	public static class Assert {
		 private static final JavascriptExecutor driver = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		
 public static <Expected> void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //path for the Chromedriver
	ChromeDriver driver = new ChromeDriver(); //launch the browser
	System.out.println(driver.toString());
		
	
	
	//Step1: Login to the website with the URL-https://www.nsw.gov.au/news
	@Given("^User should be on the \"([^\"]*)\"$")
	public void user_should_be_on_the_something(String url) throws Throwable {
		System.err.println("Value: " + url);
	    }
	
	driver.get("https://www.nsw.gov.au/news"); // opens the url
    driver.manage().window().maximize();//maximize the browser window
    
    
    
    //Step2: Verify the title of the URL whether on the correct page or not
     @And("^title of login page should be \"([^\"]*)\"$")
	    public void title_of_login_page_should_be_something(String expected) throws Throwable {
		 
		 //Verify if title of the page is "NSW Government" 
	        RemoteWebDriver driver = null;
			Assert.assertEquals(driver.getTitle(),expected);
			 System.out.println("Assertion Passed successfully");
			
			  //Test Case will still execute even though the condition is failed
			 int i=0;
			 
				try
				{
					if(i==0);
					fail("Failed by User");
					
				}catch (AssertionError e) {
					System.out.println("Condition was failed but test continue");
				}																
		 }

	
	 
     //Step3: Wait for the 10sec for the web elements to get loaded on the web page
	 @And("^User I will wait for page to load for \"([^\"]*)\" 	$")
	    public void user_i_will_wait_for_page_to_load_for_something(String delay,int arg2) throws Throwable {
	        RemoteWebDriver driver = null;
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(delay),TimeUnit.SECONDS);
	        }
     
     
	 
	 //Step4: Click on the Select topics accordion
	 @And("^User should have clicked the Select topics accordion$")
	    public void user_should_have_clicked_the_select_topics_accordion() throws Throwable {
	    	System.out.println("And User should have clicked the Select topics accordion");
	    } 
	  
	  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Wait for element till 10sec before throwing an exception 
	 WebElement e = driver.findElement(By.xpath("//button[contains(.,"Select topics")]").click(); // Clicking the Select topics accordion
	 
	 
	 
	 //Step5: Select Business and Economy from Select topics accrodion
	  @When("^I select the Business and Economy$")
	    public void i_select_the_business_and_economy() throws Throwable {
	    	System.out.println("When I select the Business and Economy");
	    }
	  
	  
	 Thread.sleep(1000); //wait for page elements to get loaded
	 driver.findElement(By.xpath("//label[@class=\"nsw-form-checkbox__label option nsw-form-label\"][contains(.,'Business and Economy')]")).click();//Selecting Business and Economy from Select topics accrodion
	 
	 
	 //Assert the original and expected value for Business and Economy field 
	 WebElement actualValue = driver.findElement(By.xpath("//div[@class="nsw-card nsw-card--news"][1]//p[@class="nsw-card__tag"]"));//object to store value for Business and Economy xpath
	 String expectedResult ="Business and Economy";
	 String originalResult = "actualValue";
	 Assert.assertEquals(originalTitle, expectedTitle);
	 System.out.println("Assertion Passed successfully");
 }
	 
	
	 //Step6: Wait for the 10sec for the web elements to get loaded on the web page
	 @And("^User I will wait for page to load for \"([^\"]*)\" 	$")
	    public void user_i_will_wait_for_page_to_load_for_something(String delay,int arg2) throws Throwable
	 {
	        RemoteWebDriver driver = null;
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Wait for element till 10sec before throwing an exception 
			 
			   
			 
	 //Step7: Wait for the web element to be loaded and then scroll down the page	 
			 @And("^I scroll down the page$")
			    public void i_scroll_down_the_page() throws Throwable {
			        throw new PendingException();
			    }
			 js.executeScript("window.scrollBy(0,1000)");// Scroll down the page by  1000 pixel vertical
	 }
	 
	 
	 
	 //Step8:Click on the Apply button
	    @And("^I click on the Apply button$")
	    public void i_click_on_the_apply_button() throws Throwable {
	    	System.out.println("And I click on the Apply button");
	    }
	    
	 Thread.sleep(1000); //wait for page elements to get loaded
	 driver.findElement(By.xpath("//input[@id=\"edit-submit-news\"]\r\n" + "//div[@class=\"nsw-card nsw-card--news\"][1]//p[@class=\"nsw-card__tag\"]")).click(); //click on the Apply button
	 
	 @Then("^the news item cards should be filtered based on the topics selected from the select topics accordion$")
	    public void the_news_item_cards_should_be_filtered_based_on_the_topics_selected_from_the_select_topics_accordion() throws Throwable {
	          System.out.println ("Then the news item cards should be filtered based on the topics selected from the select topics accordion");
	    }

	 
	 
	 //Step9: Click on the Reset button
	    @And("^I click on the Reset button$")
	    public void i_click_on_the_reset_button() throws Throwable {
	    System.out.println("And I click on the Reset button");
	    	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Wait for element till 10sec before throwing an exception 
	 driver.findElement(By.xpath("//input[@name="op"]")).click();//click on the Reset button
	 
	 
	 @Then("^all the applied filters should be removed on the news items$")
	    public void all_the_applied_filters_should_be_removed_on_the_news_items() throws Throwable {
	    	 System.out.println("Then all the applied filters should be removed on the news items");
	    }
	 //Verify once User clicks on the Reset button , there is no Reset button present on the page
	 String buttonValue = driver.findElement(By.xpath("//input[@name="op"]"));
	 String element = "buttonValue";
	 Assert.assertNull("buttonValue");//The above assertion will pass if element is not present
	 System.out.println("Assertion Passed successfully");
	 }
			 
	 
 
   private static void fail(String string) {
			// TODO Auto-generated method stub
			
		}

   
private static void assertEquals(String title, String expected) {
			// TODO Auto-generated method stub
			
		}
		}
	    	ChromeDriver.close(); //closes the browser
	    }

	}

