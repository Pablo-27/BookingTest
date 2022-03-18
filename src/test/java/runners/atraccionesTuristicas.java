package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		tags = "@AtraccionesTuristicasAutomatic",
		glue = "stepdefinitions", 
		features = "src/test/resources/features/atraccionesTuristicas.feature",

		snippets = SnippetType.CAMELCASE)

public class atraccionesTuristicas {

}
