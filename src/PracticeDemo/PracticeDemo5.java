package PracticeDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDemo5 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(new URL("https://www.gmail.com/"));
		WebElement element=driver.findElement(By.id("identifierId"));
		Actions action=new Actions(driver);
		action.click(element).sendKeys("sivaparvathikancheti8@gmail.com").build().perform();
		action.sendKeys(Keys.CONTROL,"s");
		WebElement element2=driver.findElement(By.id("identifierNext"));
		action.click(element2).build().perform();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
