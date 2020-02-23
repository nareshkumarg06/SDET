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

public class OrderDetailsPage extends BasePage {

	// Page Factory
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	WebElement placeOrderBtn;

	 @FindBy(xpath = "//div[@class='ui-dialog-content ui-widget-content']")
	WebElement confirmdialog;
	
	 @FindBy(xpath= "//span[contains(text(),'Yes')]")
	 WebElement confYesbtn;
	 
	 @FindBy(xpath= "//span[contains(text(),'No')]")
	 WebElement confNoBtn; 

	// WebDriver driver;

	static Logger log = Logger.getLogger("Logger");

	public OrderDetailsPage() {

		PageFactory.initElements(getDriver(), this);
	}

	public PaymentPage placeOrderClick() {

		
		try {
			placeOrderBtn.click();
			
			if(confirmdialog.isDisplayed())
			{
			System.out.println(" Confirm Box Displayed");	
				confYesbtn.click();
				TestUtil.takeScreenshotOnError();
				return new PaymentPage();
			}
			else {
				confNoBtn.click();
				TestUtil.takeScreenshotOnError();
				//return  OrderDetailsPage();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	}

