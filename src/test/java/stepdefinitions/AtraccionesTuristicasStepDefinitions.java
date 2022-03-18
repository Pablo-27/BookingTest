package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidateTextOf;
import tasks.BuscarAtraccionTuristica;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static userinterfaces.AtraccionesTuristicas.LOWEST_PRICE_FOUND;

import enums.Message;
import exceptions.GeneralException;

public class AtraccionesTuristicasStepDefinitions {

	
	@When("ingresa a las atracciones turisticas y busca en Roma")
	public void ingresaALasAtraccionesTuristicasYBusca() {
	    theActorInTheSpotlight().attemptsTo(BuscarAtraccionTuristica.enBooking());
	}


	@Then("se evidencia la atraccion con precio mas bajo con {string}")
	public void seEvidenciaLaAtraccionConPrecioMasBajoCon(String price) {
		theActorInTheSpotlight().should(seeThat(ValidateTextOf.en(price, LOWEST_PRICE_FOUND), equalTo(price))
				.orComplainWith(GeneralException.class, String.format(Message.MSG_ERR_TITULO.getMessage(), price)));
	}
	
}
