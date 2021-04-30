package com.api.NswNews.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;    

@CucumberOptions(
		features= {"src/main/java/com/api/NswNews/featurefile"},
		glue= {"com.api.NswNews.stepdfn"},
		dryRun= false,
		monochrome = true
			)

public class NewsRunner extends AbstractTestNGCucumberTests {

}
