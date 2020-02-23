package com.sdet.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.sdet.base.BasePage;

public class WebEventListener extends BasePage implements WebDriverEventListener {

	public void afterChangeValueOf(WebElement element, WebDriver driver) {

	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on : " + element.toString());

	}

	public void afterFindBy(By arg0, WebElement element, WebDriver driver) {

	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated back to : " + driver + "'");

	}

	public void afterNavigateForward(WebDriver driver) {

	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to : " + url + "'");
	}

	public void afterScript(String url, WebDriver driver) {

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {

		System.out.println("Value of the " + element.toString() + "before any changes made");

	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to click on : " + element.toString());
	}

	public void beforeFindBy(By arg0, WebElement element, WebDriver driver) {

	}

	public void beforeNavigateBack(WebDriver driver) {

	}

	public void beforeNavigateForward(WebDriver driver) {

	}

	public void beforeNavigateTo(String url, WebDriver driver) {

	}

	public void beforeScript(String element, WebDriver driver) {

	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured :" + error);
		try {
			TestUtil.takeScreenshotOnError();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void afterAlertAccept(WebDriver driver) {

	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {

	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] arg2) {

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {

	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String url) {

	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {

	}

	@Override
	public void afterSwitchToWindow(String url, WebDriver driver) {

	}

	@Override
	public void beforeAlertAccept(WebDriver driver) {

	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] arg2) {

	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {

	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {

	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {

	}

	@Override
	public void beforeSwitchToWindow(String url, WebDriver driver) {

	}

}