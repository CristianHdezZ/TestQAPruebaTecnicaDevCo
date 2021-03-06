package co.com.project.certification.devco.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/crearCuentaUsuario.feature",
        tags = "@ScenarioCreacionUsuarioExitoso",
        glue = {"co.com.project.certification.devco.stepdefinitions","co.com.project.certification.devco.util"},
        snippets = SnippetType.CAMELCASE
)
public class crearCuentaUsuarioRunners {
}
