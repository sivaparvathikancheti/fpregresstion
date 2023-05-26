package Selenium.Automation;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(new URL("https://jqueryui.com/"));
		driver.findElement(By.linkText("Autocomplete")).click();
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.id("tags"));
		Actions action=new Actions(driver);
		action.click(element).sendKeys("siva").build().perform();
		driver.switchTo().defaultContent();
		WebElement driver2=driver.findElement(By.linkText("Draggable"));
		action.dragAndDropBy(driver2,150,150).build().perform();
		
		Thread.sleep(4000);
		driver.close();
	
		
		
		
		

}
}