package com.celsior.sampleproject.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {
	@Test
	public void example1() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//input[@class = \"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Goa International Airport')] ")).click();

	}

}
