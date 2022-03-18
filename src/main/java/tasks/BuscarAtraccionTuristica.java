package tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.AtraccionesTuristicas.LOW_PRICE;
import static userinterfaces.AtraccionesTuristicas.ROMA_BTN;
import static userinterfaces.AtraccionesTuristicas.SORT_LIST;
import static userinterfaces.BookingPaginaPrincipal.TURISTIC_ATRACTIONS_BTN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BuscarAtraccionTuristica implements Task{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TURISTIC_ATRACTIONS_BTN),
				Scroll.to(ROMA_BTN),
				Click.on(ROMA_BTN),
				Click.on(SORT_LIST),
				WaitUntil.the(LOW_PRICE,  isVisible()).forNoMoreThan(3).seconds(),
				Click.on(LOW_PRICE));
	}

	
	public static BuscarAtraccionTuristica enBooking() {
		return Tasks.instrumented(BuscarAtraccionTuristica.class);
	}
	
}
