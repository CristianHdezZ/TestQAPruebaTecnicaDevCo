package co.com.project.certification.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchAutosPage {
    public static final Target MENU_TRAVEL = Target.the("").located(By.xpath("(//*[contains(text(),'More travel')])[1]"));
    public static final Target BUTTON_CARS = Target.the("").located(By.xpath("(//*[contains(text(),'Cars')])[1]"));
    public static final Target BUTTON_ORIGEN = Target.the("").located(By.xpath("//button[@data-stid='location-field-locn-menu-trigger']"));
    public static final Target BUTTON_DESTINO = Target.the("").located(By.xpath("//button[@data-stid='location-field-loc2-menu-trigger']"));
    public static final Target INPUT_ORIGEN = Target.the("").located(By.id("location-field-locn"));
    public static final Target INPUT_DESTINO = Target.the("").located(By.id("location-field-loc2"));
    public static final Target BUTTON_CONSULTAR = Target.the("").located(By.xpath("//button[contains(text(),'Search')]"));
    public static final Target LABEL_MSJ = Target.the("").located(By.xpath("//*[contains(text(),'Standard SUV')]"));

}
