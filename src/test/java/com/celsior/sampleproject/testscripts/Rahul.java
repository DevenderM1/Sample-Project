package com.celsior.sampleproject.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Rahul {
	@Test
        public void example() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText()); 
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText()); 
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText()); 
        
        driver.findElement(By.id("divpaxinfo")).click();
        
        for (int i=0;i<4;i++)
        {
        	Thread.sleep(1000);
        	driver.findElement(By.id("hrefIncChd")).click();
        	Thread.sleep(1000);
        	String vlu = driver.findElement(By.xpath("//*[@id='spanChild']")).getText();
        	System.out.println(" increased   "+vlu);
        }
        driver.findElement(By.id("divpaxOptions")).click();
        
        		
	}
	
}
