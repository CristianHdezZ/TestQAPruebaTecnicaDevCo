package co.com.project.certification.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.project.certification.devco.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SignIn implements Task {
    private String strEmail;
    private String strPassword;

    public SignIn(String strEmail, String strPassword) {
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }

    public static SignIn with(String email, String password) {
        return Tasks.instrumented(SignIn.class,email,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_SIGN_IN),
                Click.on(BUTTON_SIGN_IN),
                Enter.theValue(strEmail).into(INPUT_EMAIL),
                Enter.theValue(strPassword).into(INPUT_PASSWORD),
                Click.on(BUTTON_SIGN_IN_END)
        );
    }
}
