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
	public void go_to_mySnippets_menu() {
		menuPage.go_to_my_snippets_menu();
	}

	@Step
	public void refresh_page() {
		mySnippetsPage.click_refresh_button();
	}

	@Step
	public void delete_all_snippets() {
		while (mySnippetsPage.check_is_delete_button_is_present())
			mySnippetsPage.click_delete_button();
	}

	@Step
	public void assert_all_snippets_are_deleted() {
		boolean check = mySnippetsPage.check_is_delete_button_is_present();
		assertTrue("The snippets aren't deleted", !check);
	}
}