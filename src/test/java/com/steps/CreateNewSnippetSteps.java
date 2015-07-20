package com.steps;

import java.io.IOException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import tools.SnippetsTools;

public class CreateNewSnippetSteps extends ScenarioSteps {

    SnippetsTools tools  = new SnippetsTools();

    @Step
    public void logIn(String id,String password) throws IOException {
        tools.logIn(id, password);
    }

    @Step
    public void createNewSnippet(String text) throws IOException {
        tools.createNewSnippet(text);
    }
    @StepGroup
    public void getNewSnippet(String id,String password,String text) throws IOException{
    	logIn(id, password);
    	createNewSnippet(text);
    	
    }
  
}