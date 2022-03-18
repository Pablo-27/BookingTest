package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class BookingCrearCuenta {

	public static final Target INSERT_EMAIL = Target.the("Apartado de texto para introducir un email para creacion de cuenta").locatedBy("//*[@id='username']"); 
	public static final Target SUBMIT_EMAIL_BTN = Target.the("Boton para continuar con el email introducido").locatedBy("//button[contains(., 'Continuar con e-mail')]");
	
	
}
