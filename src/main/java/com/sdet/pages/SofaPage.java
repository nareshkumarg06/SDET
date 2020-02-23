package com.sdet.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sdet.base.BasePage;

public class SofaPage extends BasePage {
	
	public SofaPage() {
		PageFactory.initElements(getDriver(), this);
		System.out.println("Entered Chair Page");
	}
}