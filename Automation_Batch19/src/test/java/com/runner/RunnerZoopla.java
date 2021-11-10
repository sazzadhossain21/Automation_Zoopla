package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./Features/loginzoopla.feature"},//path of the feature file
		glue = {"com.stepdef"},//step defination pakagename
		dryRun =false,
		monochrome = true,
		plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
		tags = " @SmokeTest " //or @NegativeTest
		)
public class RunnerZoopla extends AbstractTestNGCucumberTests{

}
