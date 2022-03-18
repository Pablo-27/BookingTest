package stepdefinitions;

import static exceptions.AddFavoriteLodgingNotCompletedException.ADD_FAVORITE_FAILED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import exceptions.AddFavoriteLodgingNotCompletedException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ViewTheItem;
import tasks.AddLodging;
import tasks.SearchLodging;
import io.cucumber.datatable.DataTable;

public class AddFavoriteLodgingStepDefinition {

	@Given("ingresa los datos de reservacion")
    public void ingresarLosDatosDeReservacion(DataTable data) {
        theActorInTheSpotlight().attemptsTo(SearchLodging.onPage(data));
    }

	@When("escoge el hotel con menor precio")
    public void escogerElHotelConMenorPrecio() {
        theActorInTheSpotlight().attemptsTo(AddLodging.toFavorites());
    }

	@Then("deberia ver el mensaje de reserva confirmada")
    public void deberiVerElMensajeDeReservaConfirmada() {
        theActorInTheSpotlight().should(seeThat(ViewTheItem.inFavorites()).orComplainWith(AddFavoriteLodgingNotCompletedException.class,ADD_FAVORITE_FAILED));
    }

}
