package utilities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.LodgingSearchResultPage.LBL_FIRST_RESULT;

public class SaveName implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_FIRST_RESULT).viewedBy(actor).asString();
    }

    public static SaveName favorite(){
        return new SaveName();
    }
}
