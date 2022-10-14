package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_03_CountryMultiScenaro.feature"},
        glue = {"StepDefinitions"},

        plugin = {"html:target//cucumber-reports.html"}

)
public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {


}
