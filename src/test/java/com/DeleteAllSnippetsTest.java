package com;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.CreateNewSnippetSteps;
import com.steps.LogInSteps;
import com.steps.MySnippetsSteps;
import com.steps.SignUpSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesRunner;

@RunWith(ThucydidesRunner.class)
//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom("/resources/data.csv")
public class DeleteAllSnippetsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://google-gruyere.appspot.com/716986045138/login")
	public Pages pages;

//	String username,password,text;
	
	@Steps
	public CreateNewSnippetSteps newSnippetSteps;

	@Steps
	public LogInSteps logInSteps;

	@Steps
	public SignUpSteps signUpSteps;

	@Steps
	public MySnippetsSteps mySnippetsSteps;

	@Test
	public void deleteTenSnippets() throws IOException {

		// signUpSteps.signUp("bianca", "test");

		logInSteps.login("bianca", "test");

		newSnippetSteps.getNewSnippet("bianca", "test", "hey");
		newSnippetSteps.getNewSnippet("bianca", "test", "i+want+to+say%0D%0A");
		newSnippetSteps.getNewSnippet("bianca", "test", "that");
		newSnippetSteps.getNewSnippet("bianca", "test", "it's");
		newSnippetSteps.getNewSnippet("bianca", "test", "monday");
		newSnippetSteps.getNewSnippet("bianca", "test", "it%27s+almost+2+o%27clock");
		newSnippetSteps.getNewSnippet("bianca", "test", "Hello");
		newSnippetSteps.getNewSnippet("bianca", "test", "Hello");
		newSnippetSteps.getNewSnippet("bianca", "test", "Hello");
		newSnippetSteps.getNewSnippet("bianca", "test", "Hello");

		mySnippetsSteps.goToMySnippetsMenu();
		webdriver.navigate().refresh();
		mySnippetsSteps.refreshPage();
		mySnippetsSteps.deleteAllSnippets();
		mySnippetsSteps.assertAllSnippetsAreDeleted();
	}

}