package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LogInPage extends PageObject {

    @FindBy(css="span[id='menu-right'] a")
    private WebElementFacade signInButton;

    @FindBy(css="input[type='text']")
    private WebElementFacade userNameTextArea;
    
    @FindBy(css="input[type='password']")
    private WebElementFacade passwordTextArea;
    
    @FindBy(css="input[type='submit']")
    private WebElementFacade loginButton;
    
  

    public void enter_user_name(String userName) {
        userNameTextArea.type(userName);
    }
    public void enter_password(String password){
    	passwordTextArea.type(password);
    }
    public void click_sing_in_button() {
        signInButton.click();
    }
    public void click_login_button(){
    	loginButton.click();
    }
  

  
}