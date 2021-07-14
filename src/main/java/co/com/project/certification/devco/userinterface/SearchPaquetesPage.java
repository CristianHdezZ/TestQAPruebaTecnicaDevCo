package co.com.project.certification.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPaquetesPage {
    public static final Target MENU_TRAVEL = Target.the("").located(By.xpath("(//*[contains(text(),'More travel')])[1]"));
    public static final Target BUTTON_PAQUETE = Target.the("").located(By.xpath("(//*[contains(text(),'Packages')])[1]"));
    public static final Target BUTTON_ORIGEN = Target.the("").located(By.xpath("//button[@data-stid='location-field-origin-menu-trigger']"));
    public static final Target BUTTON_DESTINO = Target.the("").located(By.xpath("//button[@data-stid='location-field-destination-menu-trigger']"));
    public static final Target INPUT_ORIGEN = Target.the("").located(By.id("location-field-origin"));
    public static final Target INPUT_DESTINO = Target.the("").located(By.id("location-field-destination"));
    public static final Target BUTTON_CONSULTAR = Target.the("").located(By.xpath("//button[contains(text(),'Search')]"));
    public static final Target LABEL_MSJ = Target.the("").located(By.xpath("(//*[contains(text(),'Free Cancellation Property')])[1]"));
}
