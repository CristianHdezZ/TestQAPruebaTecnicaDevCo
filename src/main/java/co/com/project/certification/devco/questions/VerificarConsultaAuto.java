package co.com.project.certification.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.project.certification.devco.userinterface.SearchAutosPage.*;

public class VerificarConsultaAuto implements Question<Boolean> {
    private String resultExpeted;

    public VerificarConsultaAuto(String resultExpeted) {
        this.resultExpeted = resultExpeted;
    }

    public static VerificarConsultaAuto es(String strResultExpected) {
        return new VerificarConsultaAuto(strResultExpected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelResult = Text.of(LABEL_MSJ).viewedBy(actor).asString();
        return resultExpeted.equalsIgnoreCase(labelResult);
    }
}
