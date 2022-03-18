package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LodgingSearchResultPage {

    public static final Target BTN_FAVORITE_FIRST_RESULT= Target.the("Primer resultado favorito").located(By.xpath("(//button[contains(@data-popover-content-id,'wl_entrypoint')])[1]"));
    public static final Target LBL_FIRST_RESULT= Target.the("Primer resultado").located(By.xpath("(//button[contains(@data-popover-content-id,'wl_entrypoint')])[1]"));
    public static final Target BTN_LOWER_PRICE= Target.the("Precio mas bajo").located(By.xpath("//li[@data-id='price']"));
    public static final Target IMG_FIRST_RESULT= Target.the("Imagen del primer resultado").located(By.xpath("//img[@class='hotel_image']"));
    public static final Target IMG_LOADING_RESULT= Target.the("Resultado de alojamiento").located(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));

}
