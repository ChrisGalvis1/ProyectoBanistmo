package co.com.banistmo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"co.com.banistmo.stepdefinitions", "co.com.banistmo.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = ""
)
public class RunnerReportePdf {
}
