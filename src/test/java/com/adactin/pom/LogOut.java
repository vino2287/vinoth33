package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	private WebDriver driver;

	@FindBy(linkText = "Logout")
	private WebElement close;

	public LogOut(WebDriver kdriver) {
		this.driver = kdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClose() {
		return close;
	}

}
