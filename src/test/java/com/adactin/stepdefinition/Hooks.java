package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactin.baseclass.cucumberproject.BaseClass;

import cucumber.api.Scenario;


public class Hooks extends BaseClass {

	public void beforeHooks(Scenario scenario) {
		System.out.println(scenario.getName());
	}

	@SuppressWarnings("unused")
	private void afterHooks(Scenario scenario) throws IOException {
		System.out.println(scenario.getStatus());
		
		if (scenario.isFailed()) {
			screenshot("C:\\Users\\user pc\\eclipse-workspace\\CucumberProject\\SrceenShot\\"+scenario.getName()+".png");
		}
	}
}
