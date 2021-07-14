package co.com.project.certification.devco.stepdefinitions;

import co.com.project.certification.devco.model.User;
import co.com.project.certification.devco.questions.VerificarMsj;
import co.com.project.certification.devco.tasks.CreateTheUser;
import co.com.project.certification.devco.tasks.OpenThePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class crearCuentaUsuarioStepdefinitions {

    @Given("^(.*) ingresa a travelocity$")
    public void cristianIngresaATravelocity(String strNameActor) throws Exception {
        theActorCalled(strNameActor).wasAbleTo(OpenThePage.traveloCity());
    }

    @When("^Dilidenciar formulario de cuenta de user$")
    public void dilidenciarFormularioDeCuentaDeUser(List<User> userList) throws Exception {
        theActorInTheSpotlight().attemptsTo(CreateTheUser.wintTheInfotions(userList.get(0)));
    }

    @Then("^debe mostrar el mensaje (.*)$")
    public void debeMostrarElMensaje(String msjExpeted) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMsj.es(msjExpeted)));
    }
}
