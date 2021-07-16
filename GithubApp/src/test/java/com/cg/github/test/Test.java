package com.cg.github.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features"}	 , glue ="com.cg.github.SteDefs",
/*plugin ="html:Reports\\GitHubReports"*/
/*plugin = "json:Reports\\GitReport.json"*/
	/*plugin = "junit:Reports\\GitReport.xml"*/
			plugin=	{"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Test {
	

}
