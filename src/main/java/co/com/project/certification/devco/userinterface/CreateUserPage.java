package co.com.project.certification.devco.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage {
    public static final Target BUTTON_SIGNIN = Target.the("Boton iniciar sesion").located(By.xpath("//button[contains(text(),'Sign in')]"));
    public static final Target BUTTON_CREATE_USER = Target.the("Boton crear cuenta usuario").located(By.xpath("//a[contains(text(),'Create a free account')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("Campo nombre").located(By.id("create-account-firstname"));
    public static final Target INPUT_LAST_NAME = Target.the("Campo Apellido").located((By.id("create-account-lastname")));
    public static final Target INPUT_EMAIL = Target.the("Campo Email").located(By.id("create-account-emailId"));
    public static final Target INPUT_PASSWORD = Target.the("Campo Password").located(By.id("create-account-password"));
    public static final Target INPUT_PASSWORD_COM = Target.the("").located(By.id("create-account-confirm-password"));
    public static final Target CHECK_PRIVACY_POLICY = Target.the("").located(By.id("create-account-expedia-policy"));
    public static final Target BUTTON_CREATE_ACCOUNT = Target.the("").located(By.id("create-account-submit-button"));
    public static final Target LABEL_MSJ_EXPECTED = Target.the("").located(By.id("create-email-account-title"));
}
