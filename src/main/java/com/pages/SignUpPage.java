package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

public class SignUpPage extends PageObject {

    @FindBy(css="span[id='menu-right'] a:nth-child(2)")
    private WebElementFacade signUpButton;

    @FindBy(css="input[type='text']")
    private WebElementFacade userNameTextArea;
    
    @FindBy(css="input[type='password']")
    private WebElementFacade passwordTextArea;
    
    @FindBy(css="input[type='submit']")
    private WebElementFacade loginButton;
  
    @FindBy(css="h2 a")
    private WebElementFacade agreeStartButton;

    public void enter_user_name(String userName) {
        userNameTextArea.type(userName);
    }
    public void enter_password(String password){
    	passwordTextArea.type(password);
    }
    public void click_sing_in_button() {
        signUpButton.click();
    }
    public void click_login_button(){
    	loginButton.click();
    }
    public void click_agree_and_start_button(){
    	agreeStartButton.click();
    }
   
   

  
}