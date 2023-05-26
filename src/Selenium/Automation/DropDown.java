package Selenium.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.rameshsoft.com");
	driver.findElement(By.xpath("//a[text()='Contact Now']")).click();
	WebElement course=driver.findElement(By.xpath("//select[@name='use_label_element']"));
	Select select=new Select(course);
	boolean status=select.isMultiple();
	if(status) {
		System.out.println("it is multi select dropdown");
	}
	else
	{
		System.out.println("it is a single drop down");
	}
	//select.selectByIndex(4);
	//select.selectByValue("Core java");
	
	select.selectByVisibleText("Selenium through Java");
	List<WebElement> selected=select.getOptions();
	System.out.println(selected.size());
	List<WebElement>sel=select.getAllSelectedOptions();
	System.out.println(sel.size());
	WebElement first=select.getFirstSelectedOption();
	System.out.println(first.getText());
	
    Thread.sleep(3000);
    driver.close();
	}

}
