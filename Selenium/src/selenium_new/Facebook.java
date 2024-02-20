package selenium_new;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.linkText("Create new account"));
		element.click();
		if (element.isEnabled()) {
			System.out.println("Element is Enabled");
		} else {
			System.out.println("Element is disabled");

		}
		Thread.sleep(4000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vijay");
		Thread.sleep(4000);
		if (element.isDisplayed()) {
			System.out.println("Element is displayed");
		}else {
			System.out.println("Element is not displayed");
		}
		String attribute = firstname.getAttribute("name");
		System.out.println(attribute);
		WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("N");
		String tagName = Surname.getTagName();
		System.out.println(tagName);
		
		if (element.isSelected()) {
			System.out.println("Element is Selected");
		}else {
			System.out.println("Element is not Selected");
		}
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("vijayarcade4@gmail.com");
		Thread.sleep(5000);
		String cssValue = email.getCssValue(tagName);
		System.out.println(cssValue);
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Vijay123+");
		//WebElement element2 = driver.findElement(By.name("birthday_day"));
		//element2.click();
		WebElement element2 = driver.findElement(By.name("reg_email_confirmation__"));
		element2.sendKeys("vijayarcade4@gmail.com");
		Thread.sleep(4000);
		WebElement element3 = driver.findElement(By.className("_8esa"));
		element3.click();
		WebElement element4 = driver.findElement(By.id("month"));
		element4.sendKeys("Jun");
		WebElement element5 = driver.findElement(By.id("day"));
		element5.sendKeys("21");
		WebElement element6 = driver.findElement(By.id("year"));
		element6.sendKeys("2000");
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
