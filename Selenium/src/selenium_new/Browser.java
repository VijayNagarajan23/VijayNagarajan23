package selenium_new;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Browser Name:");
		String a = s.nextLine().toLowerCase();
		WebDriver b;
		
		if(a.equals("chrome")) {
			b = new ChromeDriver();
			b.get("https://www.google.com");
			Thread.sleep(4000);
			b.close();
		}else if (a.equals("edge")) {
			b=new EdgeDriver();
			b.get("https://www.facebook.com");
			Thread.sleep(4000);
			b.close();
		}else if (a.equals("firefox")) {
			b=new FirefoxDriver();
			b.get("https://www.gmail.com");
			Thread.sleep(4000);
			b.close();
		}else {
			System.out.println("Invalid Response");
		}
		s.close();
	}

}
