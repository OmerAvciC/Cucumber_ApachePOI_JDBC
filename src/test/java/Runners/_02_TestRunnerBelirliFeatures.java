package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_02_Country.feature"},
        glue = {"StepDefinitions"}

)

public class _02_TestRunnerBelirliFeatures extends AbstractTestNGCucumberTests {
}
