package selenium_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_2 {
	
	
	
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		element.click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("vijayarcade3@gmail.com");
		WebElement element2 = driver.findElement(By.className("a-button-input"));
		element2.click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Vijay565+");
		WebElement signin = driver.findElement(By.className("a-button-input"));
		signin.click();
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("iPhone 15");
		WebElement element3 = driver.findElement(By.id("nav-search-submit-button"));
		element3.click();
		WebElement element4 = driver.findElement(By.partialLinkText("iPhone 15 (256 GB) - Blue"));
		element4.click();
		Thread.sleep(4000);
		WebElement addtocart = driver.findElement(By.className("a-button-input"));
		addtocart.click();
		System.out.println("Completed");
		
	}

}
