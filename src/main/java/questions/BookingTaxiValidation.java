package questions;

import static userinterfaces.TaxisAeropuerto.RESERVATION_DATA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BookingTaxiValidation implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return RESERVATION_DATA.resolveFor(actor).isVisible();
	}

	public static BookingTaxiValidation exitoso() {
		return new BookingTaxiValidation();
	}
}