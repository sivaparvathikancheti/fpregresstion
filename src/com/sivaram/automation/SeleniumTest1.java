package com.sivaram.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\eclipse-workspace\\AdditionDemo\\AdditionDemo\\Drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.gmail.com/");
    WebElement element=driver.findElement(By.id("identifierId"));
    element.clear();
    element.sendKeys("sivaparvathikancheti8@gmail.com");
    WebElement element1=driver.findElement(By.id("identifierNext"));
    element1.click();
   Thread.sleep(5000);
    driver.close();
  

	}

}
