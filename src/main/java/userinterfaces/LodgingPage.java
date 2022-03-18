package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LodgingPage {

    public static final Target TXT_SEARCH = Target.the("Campo de Busqueda").located(By.id("ss"));
    public static final Target CLD_CALENDAR = Target.the("Calendarrio").located(By.xpath("//div[@data-mode='checkin']"));
    public static final Target CLD_CHECK_IN = Target.the("CheckIn Fecha").locatedBy("//td[@data-date='{0}']");
    public static final Target CLD_CHECK_OUT = Target.the("CheckOut Fecha").locatedBy("//td[@data-date='{0}']");
    public static final Target BTN_SEARCH = Target.the("Boton de busqueda").located(By.xpath("//button[@data-sb-id='main']"));
}
