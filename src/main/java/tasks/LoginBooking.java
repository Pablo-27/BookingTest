package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.BookingCrearCuenta.SUBMIT_EMAIL_BTN;
import static userinterfaces.BookingCrearCuenta.INSERT_EMAIL;

import static userinterfaces.BookingPaginaPrincipal.SINGIN;
import static userinterfaces.Login.PASSWORD;
import static userinterfaces.Login.SINGIN_BTN;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginBooking implements Task {

	private DataTable dataEdit;
	private Map<String, String> information;
	private Usuario editUser; 

	public LoginBooking(DataTable usuario) {
		this.dataEdit = usuario;
		this.information = this.dataEdit.asMap(String.class, String.class);
		editUser = new Usuario(information.get("email"),information.get("password"));
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SINGIN),
				Enter.theValue(editUser.getEmail()).into(INSERT_EMAIL),
				Click.on(SUBMIT_EMAIL_BTN),
				Enter.theValue(editUser.getPassword()).into(PASSWORD),
				Click.on(SINGIN_BTN));

	}
	
	public static LoginBooking conDatos(DataTable data){
        return instrumented(LoginBooking.class, data);
    }

}
