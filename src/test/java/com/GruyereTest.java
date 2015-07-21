package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.GruyereSteps;

import Tools.Constants;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;

public class GruyereTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages(defaultUrl = Constants.logingruyereURL)

	@Steps
	public GruyereSteps gruyereSteps;

	@Test
	public void signInWithSuccess() {
		gruyereSteps.typeUserName(Constants.username);
		gruyereSteps.entersPass(Constants.password);
		gruyereSteps.clickSignIn();
		gruyereSteps.startsLogIn();
	}
}
