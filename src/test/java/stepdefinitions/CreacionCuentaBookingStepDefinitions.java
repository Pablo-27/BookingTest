package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static userinterfaces.BookingCrearContraseña.TEXT_TO_VALIDATE;
import static utilities.LinksAndTools.URL_BOOKING;

import enums.Message;
import exceptions.GeneralException;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateTextOf;
import tasks.IngresarDataCreacionCuenta;

public class CreacionCuentaBookingStepDefinitions {

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("{string} navega a la pagina de Booking")
	public void navegarALaPaginaDeBooking(String actor) {
		theActor(actor).wasAbleTo(Open.url(URL_BOOKING));
	}

	@When("Ingresa al apartado crear cuenta Y introduce un email para la creacion de la cuenta {string} y password {string}")
	public void ingresaAlApartadoCrearCuentaYIntroduceUnEmailParaLaCreaciNDeLaCuenta(String email, String password) {
		theActorInTheSpotlight().attemptsTo(IngresarDataCreacionCuenta.conDatos(email, password));
	}

	@Then("Valida el correo ingresado para la creacion de la cuenta {string}")
	public void validaElCorreoIngresadoParaLaCreaciNDeLaCuenta(String text) {
		theActorInTheSpotlight().should(seeThat(ValidateTextOf.en(text, TEXT_TO_VALIDATE), equalTo(text))
				.orComplainWith(GeneralException.class, String.format(Message.MSG_ERR_TITULO.getMessage(), text)));
	}

}
