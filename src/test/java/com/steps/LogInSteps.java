package com.steps;

import com.pages.LogInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInSteps extends ScenarioSteps {

    LogInPage logInPage;

    @Step
    public void enter_user_name(String userName){
    	logInPage.enter_user_name(userName);
    }
    @Step
    public void enter_password(String password){
    	logInPage.enter_password(password);
    }
    @Step
    public void click_sign_in(){
    	logInPage.click_sing_in_button();
    }
    @Step
    public void click_login(){
    	logInPage.click_login_button();
    }
  
    @StepGroup
    public void login(String userName,String password){
    	open_home_page();

    	click_sign_in();
    	enter_user_name(userName);
    	enter_password(password);
    	click_login();
    }
    @Step
	public void open_home_page() {
		getDriver().manage().window().maximize();
		logInPage.open();

	}
  
}