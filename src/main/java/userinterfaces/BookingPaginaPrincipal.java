package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class BookingPaginaPrincipal {


	 public static final Target MAKE_ACCOUNT_BTN = Target.the("Boton para empezar a crear a la cuenta").locatedBy("//header[contains(., 'Hazte una cuenta')]");
	 public static final Target SINGIN = Target.the("Boton de logueo").locatedBy("//span[contains(.,'Inicia')]");
	 public static final Target NOTIFICATIONS_BTN = Target.the("Notifications button").locatedBy("//button[@data-text='Ver tus notificaciones']");
	 public static final Target FLIGHTS = Target.the("Boton de vuelos en la pagina principal").locatedBy("//span[@class='bui-tab__text'][contains(., 'Vuelos')]");
	 public static final Target TURISTIC_ATRACTIONS_BTN = Target.the("boton para aceeder a las tracciones turisticas").locatedBy("//span[@class='bui-tab__text'][contains(., 'Atracciones')]");
	 public static final Target BTN_FAVOTIRES=Target.the("Favorites button").locatedBy("//span[contains(.,'Favori')]");
	 public static final Target BTN_PROFILE_MENU=Target.the("Profile menu button").locatedBy("profile-menu-trigger--content");
	 
}
