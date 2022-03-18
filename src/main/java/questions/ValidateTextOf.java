package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateTextOf implements Question<String> {

	private String text;
	private Target target;

	public ValidateTextOf(String text, Target target) {
		this.text = text;
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target.of(text)).viewedBy(actor).asString();
	}

	public static ValidateTextOf en(String text, Target target) {
		return new ValidateTextOf(text, target);
	}
	
}

