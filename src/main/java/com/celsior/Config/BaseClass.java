package com.celsior.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;



public class BaseClass {
	public WebDriver driver;
	
       
    
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://celsiortech.com/");
	}
//	@AfterMethod
//	public void closeBrowser() {
//		if(driver!=null) {
//			driver.quit();
//		}
//	}

}
