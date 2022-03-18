package stepdefinitions;

import static exceptions.FailedLogin.LOGIN_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import exceptions.FailedLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.LoginValidation;
import tasks.LoginBooking;

public class LoginBookingStepDefinitions {

	@When("ingresa el username y password")
	public void ingresaElUsernameYPassword(io.cucumber.datatable.DataTable data) {
		theActorInTheSpotlight().attemptsTo(LoginBooking.conDatos(data));
	}

	@Then("deberia estar logueado")
	public void deberiaEstarLogueado() {
	    theActorInTheSpotlight().should(seeThat(LoginValidation.exitoso()).orComplainWith(FailedLogin.class, LOGIN_FAILED_MESSAGE));
	}
	
	
}
