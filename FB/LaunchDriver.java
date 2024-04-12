package FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {
	
static WebDriver driver = null;

	

	public LaunchDriver(){

	driver = new ChromeDriver();

	driver.get("https://www.facebook.com/login/");

	}

}
