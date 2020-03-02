package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.cucumberproject.BaseClass;
import com.adactin.readers.FileReaderManager;
import com.adactin.readers.PageObjectModule;
import com.adactin.runner.Runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	public static PageObjectModule pom = new PageObjectModule(driver);
	
	
	@Given("User launch the adactin")
	public void user_launch_the_adactin() {
		
		System.out.println("User Launch application");
	   }

	@Given("User click the login1 to validate")
	public void user_click_the_login1_to_validate() {
	System.out.println("Hello");    
	}

	
	@Given("User launch the adactin application1")
	public void user_launch_the_adactin_application1() throws IOException {
		
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}

	@When("User enter the valid username {string} in username1")
	public void user_enter_the_valid_username_in_username1(String string) {
		inputValueElement(pom.getLp().getUserName(), string);
		
	}

	@When("User enter the valid password {string} in password1")
	public void user_enter_the_valid_password_in_password1(String string) {
		inputValueElement(pom.getLp().getPassword(), string);
		
	}

	@Then("User click the login1")
	public void user_click_the_login1() {
		clickOnElement(pom.getLp().getLogin());
		
	}

	@Given("User launch the adactin application")
	public void user_launch_the_adactin_application() throws IOException {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		getUrl(url);

	}
	
	@When("User enter the valid username {string} in username")
	public void user_enter_the_valid_username_in_username(String string) {
		inputValueElement(pom.getLp().getUserName(), string);
	}

	@When("User enter the valid password {string} in password")
	public void user_enter_the_valid_password_in_password(String string) {
		inputValueElement(pom.getLp().getPassword(), string);
	}

	@When("User click the login")
	public void user_click_the_login() {
		clickOnElement(pom.getLp().getLogin());

	}

	@When("User select the location")
	public void user_select_the_location() {
		selection(pom.getSh().getSelectLocation(), "byValue", "New York");
	}

	@And("User select the hotel")
	public void user_select_the_hotel() {
		selection(pom.getSh().getSelectHotel(), "byValue", "Hotel Sunshine");
	}

	@And("User select the room type")
	public void user_select_the_room_type() {
		selection(pom.getSh().getRoomType(), "byValue", "Super Deluxe");
	}

	@And("User select the numbers of rooms")
	public void user_select_the_numbers_of_rooms() {
		selection(pom.getSh().getNumberOfRooms(), "byIndex", "2");
	}

	@And("User select the check in date, month and year")
	public void user_select_the_check_in_date_month_and_year() {
		elementClear(pom.getSh().getCheckInDate());
		inputValueElement(pom.getSh().getCheckInDate(), "25/02/2020");
	}

	@And("User select the check out date, month and year")
	public void user_select_the_check_out_date_month_and_year() {
		elementClear(pom.getSh().getCheckOutDate());
		inputValueElement(pom.getSh().getCheckOutDate(), "28/02/2020");
	}

	@And("User select the adults room")
	public void user_select_the_adults_room() {
		selection(pom.getSh().getAdultsPerRoom(), "byIndex", "2");
	}

	@And("User select the children per room")
	public void user_select_the_children_per_room() {
		selection(pom.getSh().getChildrenPerRoom(), "byIndex", "2");
	}

	@Then("User select the search button")
	public void user_select_the_search_button() {
		clickOnElement(pom.getSh().getSearch());
	}

	@When("User select the radio button")
	public void user_select_the_radio_button() {
		clickOnElement(pom.getSlh().getSelect());
	}

	@Then("User click the continue button")
	public void user_click_the_continue_button() {
		clickOnElement(pom.getSlh().getContinueButton());
	}

	@When("User enter the first name")
	public void user_enter_the_first_name() {
		inputValueElement(pom.getBh().getFirstName(), "Vinoth");
	}

	@When("User enter the last name")
	public void user_enter_the_last_name() {
		inputValueElement(pom.getBh().getLastName(), "Kumar");
	}

	@When("User enter the valid billing address")
	public void user_enter_the_valid_billing_address() {
		inputValueElement(pom.getBh().getBillingAddress(), "47 W 13th St, New York, NY 10011");
	}

	@When("User enter the valid sixteen digit credit card number")
	public void user_enter_the_valid_sixteen_digit_credit_card_number() {
		inputValueElement(pom.getBh().getCreditCard(), "1111222233334444");
	}

	@When("User select the credit card type")
	public void user_select_the_credit_card_type() {
		selection(pom.getBh().getCardType(), "byValue", "AMEX");
	}

	@When("User select the expiry month")
	public void user_select_the_expiry_month() {
		selection(pom.getBh().getExpiryMonth(), "byIndex", "11");
	}

	@When("User select the expiry year")
	public void user_select_the_expiry_year() {
		selection(pom.getBh().getExpiryYear(), "byValue", "2022");
	}

	@When("User enter the valid cvv number")
	public void user_enter_the_valid_cvv_number() {
		inputValueElement(pom.getBh().getCvvNumber(), "123");
	}

	@Then("User click the book now button")
	public void user_click_the_book_now_button() {
		clickOnElement(pom.getBh().getBookNow());
	}

	@When("User check confirmation deatails and logout the application")
	public void user_check_confirmation_deatails_and_logout_the_application() {
		clickOnElement(pom.getLo().getClose());
	}

}
