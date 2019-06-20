package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
public static void main(String[] args) {
	WebDriver  driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
WebElement	sourcetraget=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
WebElement tragetElement=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
	
	Actions act=new Actions(driver);
	act.clickAndHold(sourcetraget).moveToElement(tragetElement).release().build().perform();
	
	driver.close();
	
	
}
}
