package co.com.project.certification.devco.stepdefinitions;

import co.com.project.certification.devco.questions.VerificarMsjLogin;
import co.com.project.certification.devco.questions.VerificarMsjLoginFailed;
import co.com.project.certification.devco.tasks.OpenThePage;
import co.com.project.certification.devco.tasks.SignIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepdefinitions {

    @Given("^(.*) ingresa a la pagina de travelocity$")
    public void IngresaALaPaginaDeTravelocity(String strNameActor) throws Exception {
        theActorCalled(strNameActor).wasAbleTo(OpenThePage.traveloCity());
    }

    @When("^ingresa las credenciales$")
    public void ingresaLasCredenciales(List<String> strListCuenta) throws Exception {
        theActorInTheSpotlight().attemptsTo(SignIn.with(strListCuenta.get(0),strListCuenta.get(1)));
    }

    @Then("^debe mostrar el siguiente mensaje (.*)$")
    public void debeMostrarElSiguienteMensaje(String strResultExpected) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMsjLogin.es(strResultExpected)));
    }
    @Then("^debe mostrar el siguiente error (.*)$")
    public void debeMostrarElSiguienteError(String strMsjExpected) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMsjLoginFailed.es(strMsjExpected)));
    }
}
