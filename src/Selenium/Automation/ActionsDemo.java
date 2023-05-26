package Selenium.Automation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com");
	//driver.navigate().to("https://www.gmail.com");
	//driver.navigate().to(new URL("https://www.gmail.com"));
	WebElement element=driver.findElement(By.id("identifierId"));
	Actions actions= new Actions(driver);
	actions.click(element).sendKeys(element,"sivaparvathikancheti8@gmail.com").build().perform();
	Thread.sleep(3000);
	WebElement nxt=driver.findElement(By.id("identifierNext"));
	actions.click(nxt).build().perform();
	actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"s");
	Thread.sleep(3000);
driver.close();
	}


}
