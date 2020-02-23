package com.sdet.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.base.BasePage;

public class ChairPage extends BasePage {
	
	public ChairPage() {
		PageFactory.initElements(getDriver(), this);
		System.out.println("Entered Chair Page");
	}
}
	
//	public  void chairClick() {
//		username.sendKeys(usr);
//		//Actions action = new Actions(getDriver());
//		//action.moveToElement(password).sendKeys(pwd);
//		password.sendKeys(pwd);
//		signInBtn.click();

