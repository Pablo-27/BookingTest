package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.BookingCrearCuenta.INSERT_EMAIL;
import static userinterfaces.BookingCrearCuenta.SUBMIT_EMAIL_BTN;

import static userinterfaces.BookingPaginaPrincipal.MAKE_ACCOUNT_BTN;
import static userinterfaces.BookingCrearContraseña.CONFIRMED_PASS;
import static userinterfaces.BookingCrearContraseña.MAKE_ACCOUNT_BTN_SUBMIT;
import static userinterfaces.BookingCrearContraseña.NEW_PASS;


public class IngresarDataCreacionCuenta implements Task {

	
	String email;
	String password; 
	
	public  IngresarDataCreacionCuenta(String email, String password) {
		
		this.email = email;
		this.password = password; 
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(MAKE_ACCOUNT_BTN), Enter.theValue(email).into(INSERT_EMAIL),
				Click.on(SUBMIT_EMAIL_BTN),
		
		Enter.theValue(password).into(NEW_PASS), Enter.theValue(password).into(CONFIRMED_PASS),
				Click.on(MAKE_ACCOUNT_BTN_SUBMIT));
		
	}
	
	
	public static IngresarDataCreacionCuenta conDatos(String email, String password) {
		return Tasks.instrumented(IngresarDataCreacionCuenta.class, email, password);
	}
	
	

}
