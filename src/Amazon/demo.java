package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		driver.close();

	}

}
