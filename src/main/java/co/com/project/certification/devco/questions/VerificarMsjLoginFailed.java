package co.com.project.certification.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.swing.*;

import static co.com.project.certification.devco.userinterface.LoginPage.LABEL_MSJ_EXPETED;
import static co.com.project.certification.devco.userinterface.LoginPage.LABEL_MSJ_EXPETED_FAILED;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificarMsjLoginFailed implements Question<Boolean> {
    private String resultExpeted;

    public VerificarMsjLoginFailed(String resultExpeted) {
        this.resultExpeted = resultExpeted;
    }

    public static VerificarMsjLoginFailed es(String strResultExpected) {
        return new VerificarMsjLoginFailed(strResultExpected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelResult = Text.of(LABEL_MSJ_EXPETED_FAILED).viewedBy(actor).asString();
        return resultExpeted.contains(labelResult);
    }
}
