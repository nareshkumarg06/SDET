package com.sdet.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sdet.util.TestUtil;
import com.sdet.util.WebEventListener;

import java.util.*;

public class BasePage{
	private static WebDriver driver;
	private static Properties prop;
	private static EventFiringWebDriver el_driver;
	private static WebEventListener eventListener;
	
	
	public BasePage() {
		try {
			setProp(new Properties());
			// String userdir = System.getProperty("user.dir +
			// "/SDETAssignment/src/main/java/com/sdet/config/config.properties");
			FileInputStream inputstrm = new FileInputStream(
					"D:\\SeleniumProject\\SeleniumProject\\src\\main\\java\\com\\mtsdet\\config\\config.properties");
			getProp().load(inputstrm);
			System.out.println(inputstrm);
			return;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() throws Exception {
		String browsername = getProp().getProperty("browser");
		String usrname= getProp().getProperty("username");
		String pwdname= getProp().getProperty("password");
		String urlname= getProp().getProperty("url");
		System.out.println(usrname);
		System.out.println(pwdname);
		System.out.println(urlname);
		//String browsername = "chrome";
		System.out.println("Entered Initi");
		if (browsername.equalsIgnoreCase("firefox")) {
			System.out.println("Entered If Loop");

			System.setProperty("webdriver.gecko.driver",
					"D:\\JavaSeleniumAssignment\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			setDriver(new FirefoxDriver());
			
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\JavaSeleniumAssignment\\chromedriver_win32\\chromedriver.exe");
			setDriver(new ChromeDriver());
		} else if (browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");
			setDriver(new EdgeDriver());
		} else {
			throw new Exception("Browser is not correct");
		}
		
		el_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		el_driver.register(eventListener);
		driver = el_driver;

		getDriver().manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		getDriver().get(getProp().getProperty("url"));
	}
	
	public static void closebroswer()	{
		getDriver().quit();
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BasePage.driver = driver;
	}

	public static Properties getProp() {
		return prop;
	}

	public static void setProp(Properties prop) {
		BasePage.prop = prop;
	}
}
