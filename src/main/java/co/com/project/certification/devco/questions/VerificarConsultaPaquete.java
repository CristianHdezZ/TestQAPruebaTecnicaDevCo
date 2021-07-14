package co.com.project.certification.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.project.certification.devco.userinterface.SearchPaquetesPage.LABEL_MSJ;

public class VerificarConsultaPaquete implements Question<Boolean> {
    private String resultExpeted;

    public VerificarConsultaPaquete(String resultExpeted) {
        this.resultExpeted = resultExpeted;
    }

    public static VerificarConsultaPaquete es(String strResultExpected) {
        return new VerificarConsultaPaquete(strResultExpected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelResult = Text.of(LABEL_MSJ).viewedBy(actor).asString();
        return resultExpeted.equalsIgnoreCase(labelResult);
    }
}
