package co.com.project.certification.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.project.certification.devco.userinterface.CreateUserPage.*;

public class VerificarMsj implements Question<Boolean> {
    private String resultExpeted;

    public VerificarMsj(String resultExpeted) {
        this.resultExpeted = resultExpeted;
    }

    public static VerificarMsj es(String msjExpeted) {
        return new VerificarMsj(msjExpeted);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelResult = Text.of(LABEL_MSJ_EXPECTED).viewedBy(actor).asString();
        return resultExpeted.equalsIgnoreCase(labelResult);
    }
}
