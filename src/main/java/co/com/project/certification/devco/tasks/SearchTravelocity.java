package co.com.project.certification.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.project.certification.devco.userinterface.SearchAutosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchTravelocity implements Task {
    private String strOrigen;
    private String strDestino;

    public SearchTravelocity(String strOrigen, String strDestino) {
        this.strOrigen = strOrigen;
        this.strDestino = strDestino;
    }

    public static SearchTravelocity inTheMouleWith(String origen, String destino) {
        return Tasks.instrumented(SearchTravelocity.class,origen,destino);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_TRAVEL),
                Click.on(BUTTON_CARS),
                Click.on(BUTTON_ORIGEN),
                Enter.theValue(strOrigen).into(INPUT_ORIGEN),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(INPUT_ORIGEN),
                Click.on(BUTTON_DESTINO),
                Enter.theValue(strDestino).into(INPUT_DESTINO),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(INPUT_DESTINO),
                Click.on(BUTTON_CONSULTAR),
                WaitUntil.the(LABEL_MSJ,isVisible()).forNoMoreThan(15).seconds()
        );
    }
}
