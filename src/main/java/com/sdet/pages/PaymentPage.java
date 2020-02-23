package com.sdet.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sdet.base.BasePage;
import com.sdet.util.TestUtil;

public class PaymentPage extends BasePage {
	// Page Factory
	@FindBy(xpath = "//div[@class='ui-g']//div[1]//p-radiobutton[1]//div[1]//div[2]//span[1]")
	WebElement cccradioBtn;

	@FindBy(xpath = "//button[@class='btn btn-success ng-star-inserted']")
	WebElement placeodrerBtn;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement orderconfmsg;
	
	// WebDriver driver;
	public PaymentPage() {
		PageFactory.initElements(getDriver(), this);
		}

	public void ccselectClick() throws IOException {
			
		try {
			cccradioBtn.click();
			placeodrerBtn.click();
			TestUtil.takeScreenshotOnError();
			}
			
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(orderconfmsg.isDisplayed()) {
			TestUtil.takeScreenshotOnError();
//		WebDriverWait wait= new WebDriverWait(getDriver(), 10);
//		wait.until(ExpectedConditions.invisibilityOfAllElements(orderconfmsg));
	}
	}
}
