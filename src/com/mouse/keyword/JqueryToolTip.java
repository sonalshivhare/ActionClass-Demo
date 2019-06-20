package com.mouse.keyword;

import org.openqa.selenium.interactions.Action;		
import org.openqa.selenium.interactions.Actions;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;		

public class JqueryToolTip {				
    public static void main(String[] args) {									
     
        String baseUrl = "http://demo.guru99.com/test/tooltip.html";					
       // System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");	
        
        WebDriver driver = new FirefoxDriver();				
        String expectedTooltip = "What's new in 3.2";					
        driver.get(baseUrl);					
        		
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
        Actions builder = new Actions (driver);							

       // builder.clickAndHold().moveToElement(download).build().perform();				
       builder.moveToElement(download).build().perform(); 	
        
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();			
   }		
}		
