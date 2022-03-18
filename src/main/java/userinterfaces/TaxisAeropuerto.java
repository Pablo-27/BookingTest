package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TaxisAeropuerto {

	
	public static final Target TAXIS_AERO_BTN = Target.the("boton para acceder a las reservas de taxis").locatedBy("//a[@data-decider-header='rideways']");
	public static final Target PICK_UP = Target.the("campo para ingresar el lugar de recogida").locatedBy("//*[@id='pickupLocation']"); 
	public static final Target DESTINATION = Target.the("campo para ingresarel lugar de destino").locatedBy("//*[@id='dropoffLocation']");
	public static final Target LBL_PICKUP_PLACE= Target.the("Pickup place label").locatedBy("//ul[@id='pickupLocation-items']/child::li[2]");
	public static final Target LBL_DROPOFF_PLACE= Target.the("Dropoff place label").locatedBy("//ul[@id='dropoffLocation-items']/child::li[2]");	
	public static final Target TIME_NUMBER = Target.the("Numero horario").locatedBy("//*[@id='pickupHour']");		
	public static final Target SEARCH = Target.the("boton de busqueda").locatedBy("//*[@class='gb-u-display-none gb-u-display-block@l gb-u-mb-'][contains(., 'Buscar')]");	
	public static final Target RESERVATION_DATA = Target.the("Datos se reservacion").locatedBy("//*[@id=\"bookingSummary\"]/div[1]/h2");
	public static final Target LTS_PICKUP_HOUR = Target.the("Pickup hour list").locatedBy("//select[@id='pickupHour']");
	public static final Target BTN_PICKUP_TIME = Target.the("Pickup time button").locatedBy("//button[@aria-label='pickup time input field']");
	public static final Target LTS_PASSENGERS= Target.the("Passengers list").locatedBy("//select[@id='passengers']");

}
 