package tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.LodgingPage.BTN_SEARCH;
import static userinterfaces.LodgingPage.CLD_CALENDAR;
import static userinterfaces.LodgingPage.CLD_CHECK_IN;
import static userinterfaces.LodgingPage.CLD_CHECK_OUT;
import static userinterfaces.LodgingPage.TXT_SEARCH;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import models.HotelReservationModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchLodging implements Task {

	private DataTable dataEdit;
	private Map<String, String> information;
	private HotelReservationModel editData; 

	public SearchLodging(DataTable data) {
		this.dataEdit = data;
		this.information = this.dataEdit.asMap(String.class, String.class);
		editData = new HotelReservationModel(information.get("destination"), information.get("checkIn"),information.get("checkOut"));
	}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_SEARCH, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(editData.getDestination()).into(TXT_SEARCH),
                Click.on(CLD_CALENDAR),
                Click.on(CLD_CHECK_IN.of(editData.getCheckIn())),
                Click.on(CLD_CHECK_OUT.of(editData.getCheckOut())),
                Click.on(BTN_SEARCH)
        );

    }

    public static SearchLodging onPage(DataTable data){
        return Tasks.instrumented(SearchLodging.class, data);
    }
}
