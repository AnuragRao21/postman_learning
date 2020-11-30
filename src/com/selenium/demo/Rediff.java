package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Rediff {
	WebDriver driver;

@Test(priority=1) 
public void launch_browser(){
	System.out.println(" hello selenium ");
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.rediff.com/");
	String str = driver.getTitle();
	System.out.println(str);
} 
@Test(priority=2) 
public void createAccount(){
	driver.findElement(By.linkText("Create Account")).click();
	String str1=driver.getTitle();
	System.out.println(str1);
	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("anuragrao");
	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("anur1230224");
	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("anu123022");
	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("anuveer123022");
	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
	Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select")));  
	dropdown.selectByVisibleText("What is the name of your first school?");  
	driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input")).sendKeys("vnrs");
	driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[6]/td[3]/input")).sendKeys("mom");
	driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("5561230224");
	Select day = new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")));
	day.selectByVisibleText("22");  
	Select mnth = new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")));
	mnth.selectByVisibleText("FEB"); 
	Select yr = new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")));
	yr.selectByVisibleText("2002"); 
	Select city = new Select(driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")));
	city.selectByVisibleText("Secunderabad"); 
	driver.findElement(By.xpath("//*[@id='Register']")).click();
}
}



