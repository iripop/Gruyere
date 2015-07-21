package com.steps;

import com.pages.DeleteSnippetsPage;

import net.thucydides.core.annotations.Step;

import net.thucydides.core.steps.ScenarioSteps;

public class DeleteSnippetsSteps extends ScenarioSteps  {
DeleteSnippetsPage deleteSnippets;

  @Step
public void enterMySnippetsMenu(){
	deleteSnippets.clickMySnippetMenu();
}
  @Step
  public void deleteTheSnippets(){
  	deleteSnippets.deleteAllSnippets();
  }

}
