package PracticeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDemo21 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rameshsoft.com/");
		WebElement element=driver.findElement(By.xpath("//a[text()='Contact Now']"));
		element.click();
		WebElement element2=driver.findElement(By.xpath("//span[data-name='your-name']"));
		Actions action=new Actions(driver);
		action.click(element2).sendKeys(element2,"sivaparvathi");
		driver.close();
	

	}

}
