package com.celsior.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	WebElement userName = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a"));

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName() throws InterruptedException {
		try {
			Thread.sleep(1000);
			userName.click();
		} catch (Exception e) {
			System.out.print("Exeption");
		}

	}

	public void login() {
		driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
	}

	public void number() {
		String getText = driver.findElement(By.xpath("//*[@id=\":rh:\"]/div")).getText();
		System.out.println(getText);
		driver.findElement(By.xpath("//*[@id=\":rg:\"]")).click();
		driver.findElement(By.xpath("//*[@id=\":rg:\"]")).sendKeys("8639111619");
	}

}
