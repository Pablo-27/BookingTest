package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		tags = "@LoginAutomaticoExitoso",
		glue = "stepdefinitions", 
		features = "src/test/resources/features/loginBooking.feature",

		snippets = SnippetType.CAMELCASE)

public class LoginBooking {

}
