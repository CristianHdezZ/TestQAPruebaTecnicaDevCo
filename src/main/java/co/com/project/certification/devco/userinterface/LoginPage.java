package co.com.project.certification.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target MENU_SIGN_IN = Target.the("").located(By.xpath("//button[contains(text(),'Sign in')]"));
    public static final Target BUTTON_SIGN_IN = Target.the("").located(By.xpath("//a[@data-stid='link-header-account-signin']"));
    public static final Target INPUT_EMAIL = Target.the("").located(By.id("signin-loginid"));
    public static final Target INPUT_PASSWORD = Target.the("").located(By.id("signin-password"));
    public static final Target BUTTON_SIGN_IN_END = Target.the("").located(By.id("submitButton"));
    public static final Target LABEL_MSJ_EXPETED = Target.the("").located(By.xpath("//*[@id='gc-custom-header-nav-bar-acct-menu']/button"));
    public static final Target LABEL_MSJ_EXPETED_FAILED = Target.the("").located(By.xpath("//*[@id='wrong-credentials-error-div']/h5"));

}
