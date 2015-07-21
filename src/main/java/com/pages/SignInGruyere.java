package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInGruyere extends PageObject {
	@FindBy(css = "div[class='content'] input[type='text']")
	private WebElementFacade userNameInput;
	@FindBy(css = "div[class='content'] input[type='password']")
	private WebElementFacade passwordInput;
	@FindBy(css = "div[class='content'] input[type='submit']")
	private WebElementFacade logInButton;
	@FindBy(css="input[type='submit']")
    private WebElementFacade loginButton;

	public void enterUserName(String keyword) {
		userNameInput.click();
		userNameInput.sendKeys(keyword);
	}

	public void enterPassword(String keyword) {
		passwordInput.click();
		passwordInput.sendKeys(keyword);
	}

	public void clickSignIn() {
		logInButton.click();

	}
	public void clickLogInButton(){
    	loginButton.click();
    }
}
