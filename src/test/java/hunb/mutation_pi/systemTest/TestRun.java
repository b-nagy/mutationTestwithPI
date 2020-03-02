package hunb.mutation_pi.systemTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target\\cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features="src/test/java/",
        strict = true
        )
public class TestRun {
}