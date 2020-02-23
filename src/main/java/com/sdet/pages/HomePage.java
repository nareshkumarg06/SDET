package com.sdet.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sdet.base.BasePage;
import com.sdet.util.TestUtil;

public class HomePage extends BasePage {
	// Page Factory
	@FindBy(xpath = "//button[@class='mat-button mat-button-base ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Sign In')]")
	WebElement homesignBtn;

	@FindBy(className = "circle-text-chair")
	WebElement chairBtn;
	
	@FindBy(className = "circle-text-sofa")
	WebElement sofaBtn;
	
	@FindBy(className = "circle-text-table")
	WebElement tableBtn;
	
	@FindBy(className = "circle-text-bed")
	WebElement bedBtn;

	
	@FindBy(xpath = "//button[@class='btn btn-danger btn-md']")
	WebElement allfurBtn;
	
	
	// WebDriver driver;
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
		System.out.println("Entered Home Page");
	}

	public LoginPage homesignInClick() {
		System.out.println("Before SignIN click in Home Page");
		homesignBtn.click();
		return new LoginPage();

	}

	public ChairPage chairBtnClick() {
		System.out.println("Before Chair click in Home Page");
		chairBtn.click();
		return new ChairPage();

	}
	public BedPage bedBtnClick() {
		System.out.println("Before Chair click in Home Page");
		bedBtn.click();
		return new BedPage();

	}
	public SofaPage sofaBtnClick() {
		System.out.println("Before Chair click in Home Page");
		sofaBtn.click();
		return new SofaPage();

	}

	public HomePage homePageTest() {
		try {
			System.out.println(chairBtn);
			Assert.assertTrue(chairBtn.getText().contains("Chair"));
			TestUtil.takeScreenshotOnError();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new HomePage();
}
	public AllFurniturePage allfurnitureTest() {
		
		
		try {
			allfurBtn.click();
			TestUtil.takeScreenshotOnError();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AllFurniturePage();
	}
}
