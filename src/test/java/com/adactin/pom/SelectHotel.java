package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public WebDriver driver;

	@FindBy(name = "radiobutton_0")
	private WebElement select;

	@FindBy(name = "continue")
	private WebElement continueButton;

	public SelectHotel(WebDriver vdriver) {
		this.driver = vdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
