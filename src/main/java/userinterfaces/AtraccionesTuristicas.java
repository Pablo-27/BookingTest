package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AtraccionesTuristicas {

	
	public static final Target SORT_LIST = Target.the("Lista para ordenar por precios").locatedBy("//button[contains (., 'Lo más visitado')]");
	public static final Target LOW_PRICE = Target.the("Precios mas bajos de los resultados").locatedBy("//button[contains (., 'Precio más bajo')]");
	public static final Target ROMA_BTN = Target.the("atraccion turistica Roma").locatedBy("//figure[contains(., 'Roma')]");
	public static final Target LOWEST_PRICE_FOUND = Target.the("precio mas bajo en las atracciones de Roma").locatedBy("//*[@class='css-s2uf1z'][contains(., '12.537')]/div[2]"); 
	
}
