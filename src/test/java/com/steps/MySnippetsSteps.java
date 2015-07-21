package com.steps;

import static org.junit.Assert.assertTrue;

import com.pages.MenuPage;
import com.pages.MySnippetsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MySnippetsSteps extends ScenarioSteps {

	MenuPage menuPage;
	MySnippetsPage mySnippetsPage;

	

	@Step
	public void refreshPage() {
		mySnippetsPage.clickRefreshButton();
	}

	@Step
	public void deleteAllSnippets() {
		while (mySnippetsPage.checkIfDeleteButtonIsPresent())
			mySnippetsPage.clickDeleteButton();
	}

	@Step
	public void assertAllSnippetsAreDeleted() {
		boolean check = mySnippetsPage.checkIfDeleteButtonIsPresent();
		assertTrue("The snippets aren't deleted", !check);
	}
	@Step
	public void goToMySnippetsMenu() {
		menuPage.clickMySnippetsMenu();
		
	}
}