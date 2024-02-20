package selenium_new;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Launch {
	
	
	
	
	public static void main(String [] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = s.nextInt();
		if (a<10) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			driver.close();
		}else if(a==10){
			WebDriver driver =new EdgeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			driver.close();
		}else {
			WebDriver driver =new FirefoxDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			driver.close();
		}
		s.close();

	}

//	
//	public void Browser() {
//		
//		WebDriver a=new ChromeDriver();
//		a.get("https://www.google.com/");
//		
//		WebDriver b=new FirefoxDriver();
//		b.get("https://www.google.com/");
//		
//		WebDriver c=new EdgeDriver();
//		c.get("https://www.facebook.com/");
//		
//
//	}
//	public static void main(String [] args) {
//		Browser_Launch obj=new Browser_Launch();
//		//obj.Browser();
//		
//		
//		
//	}

}
