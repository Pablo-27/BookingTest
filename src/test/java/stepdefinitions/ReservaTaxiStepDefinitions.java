package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.BookingTaxiValidation;
import tasks.ReservaTaxi;

import static exceptions.FailedBookingTaxi.BOOKING_FAILED_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import exceptions.FailedBookingTaxi;

public class ReservaTaxiStepDefinitions {

	@When("Reserva un taxi")
	public void reservaUnTaxi(io.cucumber.datatable.DataTable dataTable) {
		theActorInTheSpotlight().attemptsTo(ReservaTaxi.conDatos(dataTable));
	}

	@Then("se videncian los taxis disponibles")
	public void seVidencianLosTaxisDisponibles() {
		theActorInTheSpotlight().should(seeThat(BookingTaxiValidation.exitoso()).orComplainWith(FailedBookingTaxi.class, BOOKING_FAILED_MESSAGE));
	}

}
 