package tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.TaxisAeropuerto.BTN_PICKUP_TIME;
import static userinterfaces.TaxisAeropuerto.DESTINATION;
import static userinterfaces.TaxisAeropuerto.LBL_DROPOFF_PLACE;
import static userinterfaces.TaxisAeropuerto.LBL_PICKUP_PLACE;
import static userinterfaces.TaxisAeropuerto.LTS_PASSENGERS;
import static userinterfaces.TaxisAeropuerto.LTS_PICKUP_HOUR;
import static userinterfaces.TaxisAeropuerto.PICK_UP;
import static userinterfaces.TaxisAeropuerto.RESERVATION_DATA;
import static userinterfaces.TaxisAeropuerto.SEARCH;
import static userinterfaces.TaxisAeropuerto.TAXIS_AERO_BTN;
import static userinterfaces.TaxisAeropuerto.TIME_NUMBER;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import models.TaxiReservationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class ReservaTaxi implements Task{

	private DataTable dataReserva;
	private Map<String, String> reservation;
	private TaxiReservationData reservationData; 

	public ReservaTaxi(DataTable data) {
		this.dataReserva = data;
		this.reservation = this.dataReserva.asMap(String.class, String.class);
		reservationData = new TaxiReservationData(reservation.get("origen"),reservation.get("destino"),reservation.get("fecha"), reservation.get("hora"), reservation.get("pasajeros"));
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Click.on(TAXIS_AERO_BTN),
			Enter.theValue(reservationData.getOrigen()).into(PICK_UP),
			WaitUntil.the(LBL_PICKUP_PLACE, isVisible()).forNoMoreThan(8).seconds(),
			Click.on(LBL_PICKUP_PLACE),
			Enter.theValue(reservationData.getDestino()).into(DESTINATION),
			WaitUntil.the(LBL_DROPOFF_PLACE, isVisible()).forNoMoreThan(8).seconds(),
			Click.on(LBL_DROPOFF_PLACE),				
			Click.on(BTN_PICKUP_TIME),
            SelectFromOptions.byVisibleText(reservationData.getHora()).from(LTS_PICKUP_HOUR));

    
    actor.attemptsTo(
            Click.on(TIME_NUMBER),
            SelectFromOptions.byVisibleText(reservationData.getPasajeros()).from(LTS_PASSENGERS),
            Click.on(SEARCH),
            WaitUntil.the(RESERVATION_DATA, isVisible()).forNoMoreThan(60).seconds());
    
			 
		
	}
	
	public static ReservaTaxi conDatos(DataTable data) {
		return Tasks.instrumented(ReservaTaxi.class, data);
	}

}
