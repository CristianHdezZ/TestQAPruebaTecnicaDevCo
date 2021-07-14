package co.com.project.certification.devco.tasks;

import co.com.project.certification.devco.userinterface.HomePageTraveloCity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThePage implements Task {
    private HomePageTraveloCity homePageTraveloCity;

    public static OpenThePage traveloCity() {
        return Tasks.instrumented(OpenThePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePageTraveloCity));

    }
}
