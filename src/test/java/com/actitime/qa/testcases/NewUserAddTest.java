package com.actitime.qa.testcases;



import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.NewUserAdd;

import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;

public class NewUserAddTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	NewUserAdd newUserAdd;
   
	public NewUserAddTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		usersPage = homePage.clickOnUserLink();
		newUserAdd = usersPage.clickOnNewAdduserLink();
	}

	@Test(priority = 1)
	public void addNewUserTest()throws Exception {    
		Thread.sleep(25000);
		newUserAdd.createUser("siva", "tharany", "kaaarani9978@gmail.com"); 
		Thread.sleep(15000);

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}