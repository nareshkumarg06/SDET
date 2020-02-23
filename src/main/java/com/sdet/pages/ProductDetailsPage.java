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

public class ProductDetailsPage extends BasePage {
	
		//Page Factory
		@FindBy(xpath = "//div[@class='float-right']//button[@class='btn btn-danger space'][contains(text(),'Buy Now')]")
		WebElement buynowBtn;
		
	//	@FindBy(id = "password")
	//	WebElement password;
		
	//	@FindBy(xpath= "//button[contains(text(),'Sign In')]")
	//	WebElement signInBtn;
		

	//	WebDriver driver;
		
		static Logger log = Logger.getLogger("Logger");
	  
		public ProductDetailsPage() {
			
		PageFactory.initElements(getDriver(), this);
		}

		public  OrderDetailsPage buynowClick() {
			try {
				buynowBtn.click();
				TestUtil.takeScreenshotOnError();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new OrderDetailsPage();
		}
		
		}