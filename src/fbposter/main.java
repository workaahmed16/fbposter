package fbposter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.id("email")).sendKeys("stumpy229@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("cimbom29");
	    driver.findElement(By.id("u_0_m")).click();

	}

}
