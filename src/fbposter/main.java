// By Ahmed Ahmed

package fbposter;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main {

	public static void main(String[] args) {
		
		// Disable Chrome notifications
		Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("profile.default_content_setting_values.notifications", 2);
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("prefs", prefs);
	    
	    // Maximize browser and login
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
		System.setProperty("chromedriver.exe", "");
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("Your User Name");
	    driver.findElement(By.id("pass")).sendKeys("Your Password");
	    driver.findElement(By.id("u_0_o")).submit();
	    
	    // Search User and post on walls
	    driver.get("Link to friend's wall");
	    driver.findElement(By.name("xhpc_message_text")).sendKeys("Hello World!");
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"js_j\"]/div[3]/div[2]/div/div[2]/div/button"))).click();
	}

}
