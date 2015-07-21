package com.steps;

import com.pages.SignUpPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class SignUpSteps extends ScenarioSteps {

    SignUpPage signUpPage;

    @Step
    public void typeUserName(String userName){
    	signUpPage.enterUserName(userName);
    }
    @Step
    public void typePassword(String password){
    	signUpPage.enterPassword(password);
    }
    @Step
    public void clickSignIn(){
    	signUpPage.clickSingInButton();
    }
    @Step
    public void clickLogIn(){
    	signUpPage.clickLogInButton();
    }
    @Step
    public void clickAgreeAndStart(){
    	signUpPage.clickAgreeAndStartButton();
    }
    @StepGroup
    public void signUp(String userName,String password){
    	openHomePage();
    	clickAgreeAndStart();
    	clickSignIn();
    	typeUserName(userName);
    	typePassword(password);
    	clickLogIn();
    }
    @Step
	public void openHomePage() {
		getDriver().manage().window().maximize();
		signUpPage.open();

	}
  
}