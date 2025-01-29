package com.celsior.sampleproject.testscripts;

import org.testng.annotations.Test;

import com.celsior.Config.BaseClass;
import com.celsior.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class loginTest extends BaseClass {
	//WebDriver driver;
	
	@Test
	public void loginwithcredentials() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName();
        loginPage.login();
        loginPage.number();
		
	}

}
