package com.pages;

import java.util.List;
import org.codehaus.groovy.ast.stmt.AssertStatement;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DeleteSnippetsPage extends PageObject {
	@FindBy(css = "div[class='menu'] a[href='/561580555562/snippets.gtl']")
	private WebElementFacade mySnippetsMenu;
	@FindBy(css = "div[class='content'] a[href='/561580555562/deletesnippet?']")
	private List<WebElement> snippetsList;
	
	public void clickMySnippetMenu(){
		mySnippetsMenu.click();
	}
	public void deleteAllSnippets(){
		boolean found = false;
		for (WebElement element : snippetsList) {
			found = true;
				element.click();
				break;
			}
		Assert.assertTrue("No snippets found", found);
		}
		
	}

