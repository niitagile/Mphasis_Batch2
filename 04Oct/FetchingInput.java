package testingwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FetchingInput {
	//public String baseUrl = "http://localhost:8080/SeleniumTesting/";
	
	
	public WebDriver driver;

	@Test
	public void f() {
		// set the system property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\GreatLearningAngularProjects\\chromedriver_win32/chromedriver.exe");
		// Create driver object for CHROME browser
		driver = new ChromeDriver();
		
		//driver.get("https://login.yahoo.com/account/create");
		driver.get("http://localhost:8080/SeleniumTesting/index.jsp");
		//Ftech all input Elements from current web page 
		List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
		for(WebElement e : allInputElements)
			System.out.println("Input box id="+e.getAttribute("id"));// <input type="" id="">
		driver.quit();
	}

	

}
