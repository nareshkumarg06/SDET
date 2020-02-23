package com.sdet.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sdet.base.BasePage;
import com.sdet.util.TestUtil;

public class AllFurniturePage extends BasePage {
	
	//Page Factory
	@FindBy(className ="mat-checkbox-inner-container")
	WebElement chaircheckBox;
	
	@FindBy(xpath ="//b[contains(text(),'chairTest')]")
	WebElement chairclickBtn;

	public AllFurniturePage() {

		PageFactory.initElements(getDriver(), this);
	}
	
	public AllFurniturePage allfurchairSelect() throws InterruptedException {
//		System.out.println("ENtered All Fur Page");
//		Select sel1 = new Select(chaircheckBox);
//		sel1.selectByIndex(1);
		
//		Actions sel2 = new Actions(getDriver());
//		sel2.sendKeys(Keys.EQUALS).perform();
//		Thread.sleep(1000);
		
		chaircheckBox.sendKeys(Keys.SPACE);
		return new AllFurniturePage();

	}
	
	public ProductDetailsPage chairClick() {
		
		
		try {
			chairclickBtn.click();
			TestUtil.takeScreenshotOnError();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ProductDetailsPage();
		
	}
	
}
