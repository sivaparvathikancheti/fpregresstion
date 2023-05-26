package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		WebElement element=driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']/span[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		driver.close();
		

	}

}
