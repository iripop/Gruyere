package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MenuPage extends PageObject {

	@FindBy(css = "span[id='menu-left'] a:nth-child(2)")
	private WebElementFacade mySnippetsMenu;

	@FindBy(css = "span[id='menu-left'] a:nth-child(1)")
	private WebElementFacade homeMenu;

	@FindBy(css = "span[id='menu-left'] a:nth-child(3)")
	private WebElementFacade newSnippetMenu;

	@FindBy(css = "span[id='menu-left'] a:nth-child(4)")
	private WebElementFacade uploadMenu;

	public void clickMySnippetsMenu() {
		mySnippetsMenu.click();
	}

	public void clickHomeMenu() {
		homeMenu.click();
	}
	public void clickUploadMenu(){
		uploadMenu.click();
	}

}