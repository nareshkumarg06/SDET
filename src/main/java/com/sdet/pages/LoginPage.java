package com.sdet.pages;

import java.io.IOException;
import java.util.logging.Logger;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.base.BasePage;
import com.sdet.util.TestUtil;

public class LoginPage extends BasePage {

	// Page Factory
	@FindBy(id = "emailId")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement signInBtn;

	// WebDriver driver;

	static Logger log = Logger.getLogger("Logger");

	public LoginPage() {

		PageFactory.initElements(getDriver(), this);
	}

	public void login(String usr, String pwd) {

		try {
			username.sendKeys(usr);
			// Actions action = new Actions(getDriver());
			// action.moveToElement(password).sendKeys(pwd);
			password.sendKeys(pwd);
			signInBtn.click();
			TestUtil.takeScreenshotOnError();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}