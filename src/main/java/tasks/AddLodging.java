package tasks;

import utilities.SaveName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.BookingPaginaPrincipal.BTN_FAVOTIRES;
import static userinterfaces.BookingPaginaPrincipal.BTN_PROFILE_MENU;
import static userinterfaces.LodgingSearchResultPage.BTN_FAVORITE_FIRST_RESULT;
import static utilities.LinksAndTools.FAVORITE_HOTEL_NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddLodging implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(FAVORITE_HOTEL_NAME, SaveName.favorite());

        actor.attemptsTo(
                Click.on(BTN_FAVORITE_FIRST_RESULT),
                Click.on(BTN_PROFILE_MENU),
                Click.on(BTN_FAVOTIRES)
        );

    }

    public static AddLodging toFavorites(){
        return instrumented(AddLodging.class);
    }
}
