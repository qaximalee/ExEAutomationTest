package app;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/formfeature/form1.feature",
        glue="formDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber.html"}
)
public class Runner {
}
