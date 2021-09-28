package Amazon_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazon {
	
    WebDriver driver;
	
	@Given("^Launch the browser and navigate to URL$")
	public void Launch_the_browser_and_navigate_to_URL() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");  
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	
//	@When("^User enters text in seach box and clicks on search button$")
//	public void User_enters_text_in_seach_box_and_clicks_on_search_button() {
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		
//	}
	
//	@Then("^Should display searched result$")
//	public void Should_display_searched_result() {
//		
//		
//	}
//	

}
