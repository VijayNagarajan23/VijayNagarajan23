package selenium_new;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class Selenium_Demo {
	
	public static void browser() throws InterruptedException {
		
		//WebDriver driver =new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		//WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		//driver.manage().window().setSize(size);
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		browser();
	}
}
