package com.steps;

import com.pages.LogInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInSteps extends ScenarioSteps {

    LogInPage logInPage;

    @Step
    public void typeUserName(String userName){
    	logInPage.enterUserName(userName);
    }
    @Step
    public void typePassword(String password){
    	logInPage.enterPassword(password);
    }
    @Step
    public void clickSignIn(){
    	logInPage.clickSingInButton();
    }
    @Step
    public void clickLogIn(){
    	logInPage.clickLogInButton();
    }
  
    @StepGroup
    public void login(String userName,String password){
    	openHomePage();

    	clickSignIn();
    	typeUserName(userName);
    	typePassword(password);
    	clickLogIn();
    }
    @Step
	public void openHomePage() {
		getDriver().manage().window().maximize();
		logInPage.open();

	}
  
}