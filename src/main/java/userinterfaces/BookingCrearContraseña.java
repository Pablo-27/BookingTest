package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class BookingCrearContraseña {

	public static final Target NEW_PASS = Target.the("Campo para introducir la contraseña").locatedBy("//*[@id='new_password']"); 
	public static final Target CONFIRMED_PASS = Target.the("Campo para confirmar la contraseña introducida").locatedBy("//*[@id='confirmed_password']"); 
	public static final Target MAKE_ACCOUNT_BTN_SUBMIT = Target.the("Boton para crear la cuenta con la contraseña especificada").locatedBy("//button[contains(., 'Crear una cuenta')]");
	public static final Target TEXT_TO_VALIDATE  = Target.the("Texto para ser validado")
            .locatedBy("//*[@id='profile-menu-trigger--title']");
}
 