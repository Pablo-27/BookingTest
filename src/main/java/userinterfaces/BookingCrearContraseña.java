package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class BookingCrearContrase�a {

	public static final Target NEW_PASS = Target.the("Campo para introducir la contrase�a").locatedBy("//*[@id='new_password']"); 
	public static final Target CONFIRMED_PASS = Target.the("Campo para confirmar la contrase�a introducida").locatedBy("//*[@id='confirmed_password']"); 
	public static final Target MAKE_ACCOUNT_BTN_SUBMIT = Target.the("Boton para crear la cuenta con la contrase�a especificada").locatedBy("//button[contains(., 'Crear una cuenta')]");
	public static final Target TEXT_TO_VALIDATE  = Target.the("Texto para ser validado")
            .locatedBy("//*[@id='profile-menu-trigger--title']");
}
 