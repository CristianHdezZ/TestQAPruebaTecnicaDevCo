package co.com.project.certification.devco.tasks;

import co.com.project.certification.devco.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static co.com.project.certification.devco.userinterface.CreateUserPage.*;

public class CreateTheUser implements Task {
    private User user;

    public CreateTheUser(User user) {
        this.user = user;
    }

    public static CreateTheUser wintTheInfotions(User user) {
        return Tasks.instrumented(CreateTheUser.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SIGNIN),
                Click.on(BUTTON_CREATE_USER),
                Enter.theValue(user.getNombre()).into(INPUT_FIRST_NAME),
                Enter.theValue(user.getApellido()).into(INPUT_LAST_NAME),
                Enter.theValue(user.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD_COM),
                Click.on(CHECK_PRIVACY_POLICY),
                //Scroll.to(BUTTON_CREATE_ACCOUNT),
                Click.on(BUTTON_CREATE_ACCOUNT)
        );
    }
}
