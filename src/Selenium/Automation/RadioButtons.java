package Selenium.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtons {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rameshsoft.com");
		driver.findElement(By.xpath("//a[text()='Contact Now']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@type='radio'][@value='Online']"));
		if(element.isDisplayed()&&element.isEnabled())
		{
			element.click();
		}
		else
		{
			System.out.println("radio button is not displayed");
		}
		if(element.isSelected()) {
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
