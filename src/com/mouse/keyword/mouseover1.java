package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover1 {
	
	
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver  driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.Mrbool.com");
	
	
       Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	Thread.sleep(3000);

	 driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();	
	 driver.navigate().back();
	Thread.sleep(2000);

	
	action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Courses']")).click();
     driver.navigate().back();
     Thread.sleep(2000);
   
     
     action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
 	Thread.sleep(3000);
	 driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Single Videos']")).click();	
	 driver.navigate().back();
	 Thread.sleep(2000);
	 
	 driver.close();
	
}
}
