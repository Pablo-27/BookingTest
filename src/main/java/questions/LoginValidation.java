package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterfaces.BookingPaginaPrincipal.NOTIFICATIONS_BTN;

public class LoginValidation implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return NOTIFICATIONS_BTN.resolveFor(actor).isVisible();
	}

	public static LoginValidation exitoso() {
		return new LoginValidation();
	}

}
