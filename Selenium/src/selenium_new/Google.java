package selenium_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google{
	
	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		WebElement Create = driver.findElement(By.xpath("//textarea[@aria-controls='Alh6id']"));
		Thread.sleep(4000);
		Create.sendKeys("Amazon");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Google Search']"));
		//Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='amazon']"));
		element.click();
		//Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//a[@data-pcu='https://www.amazon.in/']"));
		element2.click();
		//Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
