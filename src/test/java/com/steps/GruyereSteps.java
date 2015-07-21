package com.steps;

import com.pages.SignInGruyere;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class GruyereSteps extends ScenarioSteps {
	SignInGruyere logIn;

	@Step
	public void typeUserName(String keyword) {
		logIn.enterUserName(keyword);
	}

	@Step
	public void entersPass(String keyword) {

		logIn.enterPassword(keyword);

	}
	@Step
	public void clickSignIn() {
		logIn.clickSignIn();
	}
	@Step
	public void startsLogIn() {
		logIn.clickLogInButton();
	}

}
