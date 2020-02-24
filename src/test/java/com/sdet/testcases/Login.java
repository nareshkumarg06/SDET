package com.sdet.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import com.sdet.base.BasePage;
import com.sdet.pages.AllFurniturePage;
import com.sdet.pages.ChairPage;
import com.sdet.pages.HomePage;
import com.sdet.pages.LoginPage;
import com.sdet.pages.OrderDetailsPage;
import com.sdet.pages.PaymentPage;
import com.sdet.pages.ProductDetailsPage;
import com.sdet.util.TestUtil;

public class Login extends BasePage {
	LoginPage loginPage;
	HomePage homePage;
	ChairPage chairPage;
	AllFurniturePage allfurPage;
	OrderDetailsPage orderdetPage;
	PaymentPage paymentPage;
	ProductDetailsPage productdetPage;
	

	WebDriver driver;
	Logger log = Logger.getLogger("devpinoyLogger");

	public Login() {
		super();
		System.out.println("Completed Super method");
	}

	@BeforeTest
	public void setUp() throws Exception {
		System.out.println("Entered Super method");
		initialization();
	}

	@Test(priority=1)
	public void loginTest() throws InterruptedException, IOException {
		
		log.debug("*************************Starting Test Case - loginTest***************************");
		homePage.homesignInClick();
		loginPage.login(getProp().getProperty("username"), "Test@123");
		Thread.sleep(1000);
		log.debug("*************************Ending Test Case - loginTest***************************");
	}
	
	@Test(priority=2)
	public void homePageTest() throws InterruptedException, IOException {
		homePage.homePageTest();
	//Thread.sleep(1000);
	}	

//	@Test(priority=2)
//	public void chairbtnTest() throws InterruptedException {
//		chairPage = new ChairPage();
//		//homePage.chairBtnClick();
//		//return new ChairPage;
//		//Thread.sleep(1000);
//	}
//	
//	@Test(priority=3)
//	public void sofabtnTest() throws InterruptedException {
//		chairPage = new ChairPage();
//		//homePage.sofaBtnClick();
//	}
//	
//	@Test(priority=4)
//	public void tablebtnTest() throws InterruptedException {
//		chairPage = new ChairPage();
//		//homePage.tableBtnClick();
//	}
//	
//	@Test(priority=5)
//	public void bedbtnTest() throws InterruptedException {
//		chairPage = new ChairPage();
//		//homePage.bedBtnClick();
//	}
	

	@AfterTest
	public void closeBrowser() {
		closebroswer();
		driver.quit();
	}
}
