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
    
  

    public void enterUserName(String userName) {
        userNameTextArea.type(userName);
    }
    public void enterPassword(String password){
    	passwordTextArea.type(password);
    }
    public void clickSingInButton() {
        signInButton.click();
    }
    public void clickLogInButton(){
    	loginButton.click();
    }
  

  
}