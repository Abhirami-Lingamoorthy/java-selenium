package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import stepdef.BaseClass;

@CucumberOptions(features="src/main/java/features", glue="stepdef",snippets=SnippetType.CAMELCASE, monochrome = true)
public class ExecutionClass extends BaseClass {
	

}
