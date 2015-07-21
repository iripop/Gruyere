package com.steps;

import java.io.IOException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import Tools.SnippetsTools;

public class CreateNewSnippetSteps extends ScenarioSteps {

    SnippetsTools Tools  = new SnippetsTools();

    @Step
    public void logIn(String id,String password) throws IOException {
        Tools.logIn(id, password);
    }

    @Step
    public void createNewSnippet(String text) throws IOException {
        Tools.createNewSnippet(text);
    }
    @StepGroup
    public void getNewSnippet(String id,String password,String text) throws IOException{
    	logIn(id, password);
    	createNewSnippet(text);
    	
    }
  
}