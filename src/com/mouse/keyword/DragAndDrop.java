package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
		 
		public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("http://www.jqueryui.com/droppable/");
		 
		// Create object of actions class
		Actions act=new Actions(driver);
		 driver.switchTo().frame(0);
		// Find element xpath which we need to drag
		WebElement drag=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		 
		// Find element xpath where we need to drop
		WebElement drop=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		 
		// Drag element to destination
		act.dragAndDrop(drag, drop).build().perform();
		 
		}
}
