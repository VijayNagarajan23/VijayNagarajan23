package selenium_new;

//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;


public class Incognito {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("incognito");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.google.com");
		
	}

}
