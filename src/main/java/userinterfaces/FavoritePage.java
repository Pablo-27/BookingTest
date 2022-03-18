package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FavoritePage {

    public static final Target LBL_ELEMENT_FAVORITE= Target.the("Elemento favorito").located(By.xpath("//h1[contains(@class,'bui-card__title')]//a"));
}
