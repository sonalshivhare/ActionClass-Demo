package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
public static void main(String[] args) {
	WebDriver  driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	
   WebElement	rightClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
    act.contextClick(rightClick).build().perform();
 WebElement  copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		   String	 copytext=copy.getText();

        System.out.println(copytext);
     copy.click();
     
    
}
}
