package co.com.choucair.certification.createemployee.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/createemployee.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.createemployee.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}