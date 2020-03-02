package com.adactin.readers;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.LogOut;
import com.adactin.pom.Loginpage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectModule {

	public static WebDriver driver;

	

	@SuppressWarnings("static-access")
	public PageObjectModule(WebDriver driver2) {
		this.driver = driver2;
	}

	public Loginpage getLp() {
		Loginpage lp = new Loginpage(driver);
		return lp;
	}

	public SearchHotel getSh() {
		SearchHotel sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSlh() {
		SelectHotel slh = new SelectHotel(driver);
		return slh;
	}

	public BookHotel getBh() {
		BookHotel bh = new BookHotel(driver);
		return bh;
	}

	public LogOut getLo() {
		LogOut lo = new LogOut(driver);
		return lo;
	}

}
