package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_demo {
	WebDriver driver;
    @BeforeTest
    public void launch_browser() {
         System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
         driver = new ChromeDriver();
	     }
	     @Test(priority=1, enabled=true)
	     public void login() {
	          driver.get("https://www.amazon.in/");
	          driver.manage().window().maximize();
	          WebElement sign= driver.findElement(By.id("nav-link-accountList"));
	          Actions act = new Actions(driver);
	          act.moveToElement(sign).perform();
	          WebElement starthere= driver.findElement(By.xpath("//*[@id='nav-flyout-ya-newCust']/a"));
	          Actions act1=new Actions(driver);
	          act1.moveToElement(starthere).doubleClick().perform();
	          //driver.findElement(By.xpath("//*[@id='nav-flyout-ya-newCust']/a")).click();
	          driver.findElement(By.name("customerName")).sendKeys("karthik");
	          driver.findElement(By.xpath("//*[@id='auth-country-picker-container']/span/span")).click();
	          driver.findElement(By.xpath("//*[@id='a-popover-1']/div/div/ul/li[3]")).click();
	          driver.findElement(By.id("ap_phone_number")).sendKeys("9988776655");
	          driver.findElement(By.name("secondaryLoginClaim")).sendKeys("karthikeya@gamil.com");
	          driver.findElement(By.id("ap_password")).sendKeys("password123");
	          driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/span")).click();
	          	         
    }

}
