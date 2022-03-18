package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.FavoritePage.LBL_ELEMENT_FAVORITE;
import static utilities.LinksAndTools.FAVORITE_HOTEL_NAME;

public class ViewTheItem implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_ELEMENT_FAVORITE.resolveFor(actor).containsText(actor.recall(FAVORITE_HOTEL_NAME));
    }

    public static ViewTheItem inFavorites(){
        return new ViewTheItem();
    }
}
