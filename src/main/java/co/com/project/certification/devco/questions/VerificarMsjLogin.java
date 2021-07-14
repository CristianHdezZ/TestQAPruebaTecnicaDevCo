package co.com.project.certification.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.project.certification.devco.userinterface.LoginPage.*;

public class VerificarMsjLogin implements Question<Boolean> {
    private String resultExpeted;

    public VerificarMsjLogin(String resultExpeted) {
        this.resultExpeted = resultExpeted;
    }

    public static VerificarMsjLogin es(String strResultExpected) {
        return new VerificarMsjLogin(strResultExpected);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String labelResult = Text.of(LABEL_MSJ_EXPETED).viewedBy(actor).asString();
        return resultExpeted.equalsIgnoreCase(labelResult);
    }
}
