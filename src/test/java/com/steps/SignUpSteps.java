package com.steps;

import com.pages.SignUpPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class SignUpSteps extends ScenarioSteps {

    SignUpPage signUpPage;

    @Step
    public void enter_user_name(String userName){
    	signUpPage.enter_user_name(userName);
    }
    @Step
    public void enter_password(String password){
    	signUpPage.enter_password(password);
    }
    @Step
    public void click_sign_in(){
    	signUpPage.click_sing_in_button();
    }
    @Step
    public void click_login(){
    	signUpPage.click_login_button();
    }
    @Step
    public void click_agree_and_start(){
    	signUpPage.click_agree_and_start_button();
    }
    @StepGroup
    public void signUp(String userName,String password){
    	open_home_page();
    	click_agree_and_start();
    	click_sign_in();
    	enter_user_name(userName);
    	enter_password(password);
    	click_login();
    }
    @Step
	public void open_home_page() {
		getDriver().manage().window().maximize();
		signUpPage.open();

	}
  
}