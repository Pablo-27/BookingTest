package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

	public static final Target USERNAME = Target.the("Campo de usuario").located(By.id("username"));
	public static final Target PASSWORD = Target.the("Campo del password").located(By.id("password"));
	public static final Target SINGIN_BTN = Target.the("boton de SinGin").located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button/span"));

}
