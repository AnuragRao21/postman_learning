package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_cart_demo {
	  WebDriver driver;
	    @Test
	    public void openCart() throws Exception{
    System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://demo.opencart.com/");
    driver.manage().window().maximize();
    String str = driver.getTitle();
	System.out.println(str);
	driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/aside/div[1]/a[4]")).click();
	driver.findElement(By.xpath("//*[@id='content']/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='button-cart']")).click();

	
  
	}
}
