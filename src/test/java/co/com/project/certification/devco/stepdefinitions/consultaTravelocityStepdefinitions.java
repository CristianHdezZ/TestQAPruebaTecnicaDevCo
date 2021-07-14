package co.com.project.certification.devco.stepdefinitions;

import co.com.project.certification.devco.questions.VerificarConsultaAuto;
import co.com.project.certification.devco.questions.VerificarConsultaPaquete;
import co.com.project.certification.devco.tasks.OpenThePage;
import co.com.project.certification.devco.tasks.SearchTravelocity;
import co.com.project.certification.devco.tasks.SearchTravelocityPaquete;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class consultaTravelocityStepdefinitions {

    @Given("^(.*) visita la pagina travelocity$")
    public void VisitaLaPaginaTravelocity(String strNameActor) throws Exception {
        theActorCalled(strNameActor).wasAbleTo(OpenThePage.traveloCity());
    }

    @When("^ingresa los campos de consulta del auto$")
    public void ingresaLosCamposDeConsultaDelAuto(List<String> listDatos) throws Exception {
        theActorInTheSpotlight().attemptsTo(SearchTravelocity.inTheMouleWith(listDatos.get(0),listDatos.get(1)));
    }

    @When("^ingresa los campos de consulta del paquete$")
    public void ingresaLosCamposDeConsultaDelPaquete(List<String> listDatos) throws Exception {
        theActorInTheSpotlight().attemptsTo(SearchTravelocityPaquete.inTheMouleWith(listDatos.get(0),listDatos.get(1)));
    }

    @Then("^debe mostrar el auto (.*)$")
    public void debeMostrarElAuto(String strResultExpected) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarConsultaAuto.es(strResultExpected)));

    }

    @Then("^debe mostrar el paquete con (.*)$")
    public void debeMostrarElPaqueteCon(String strResultExpected) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarConsultaPaquete.es(strResultExpected)));

    }
}
