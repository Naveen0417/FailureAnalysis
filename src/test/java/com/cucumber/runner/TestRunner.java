package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@VeifyPIMtab", features = {"src/test/resources/features/"}, glue = {"com.cucumber.stepDefinition"},
plugin = {"pretty", "json:target/CucumberTestReport.json", "html:target/CucumberTestReport.html"})
    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}

