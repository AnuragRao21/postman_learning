package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99_countries {
	WebDriver driver;
    @BeforeTest
    public void launch_browser() {
         System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
         driver = new ChromeDriver();
	     }
    @Test(priority=1, enabled=true)
    public void login() {
         driver.get("http://demo.guru99.com/test/newtours/register.php");
         driver.manage().window().maximize();
         WebElement state= driver.findElement(By.name("country"));
         Select s1=new Select(state);
         List<WebElement> names = s1.getOptions();
         for(int i=0;i<names.size();i++)
         {
        	 String country_names=names.get(i).getText();
        	 System.out.println("Country names are "+country_names);
         }         
}
}