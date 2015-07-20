package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MySnippetsPage extends PageObject {
	@FindBy(css = "div[class='refresh'] a")
	private WebElementFacade refreshButton;

	@FindBy(css = "div[class='content'] table tr:nth-child(2) td:nth-child(2) a")
	private WebElementFacade deleteSnippetButton;

	public void click_refresh_button() {
		refreshButton.click();
	}

	public void click_delete_button() {
		deleteSnippetButton.click();
	}

	public boolean check_is_delete_button_is_present() {
		return deleteSnippetButton.isPresent();
	}
}