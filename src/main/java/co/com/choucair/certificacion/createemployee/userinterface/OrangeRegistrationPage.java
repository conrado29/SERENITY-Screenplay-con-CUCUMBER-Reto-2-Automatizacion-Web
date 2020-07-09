package co.com.choucair.certificacion.createemployee.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeRegistrationPage
{
    public static final Target USER_NAME = Target.the("nombre de usuario administradr ").located(By.id("txtUsername"));
    public static final Target USER_PASSWORD = Target.the("CONTRA de usuario administradr ").located(By.id("txtPassword"));
    public static final Target LOGIN_BUTTON = Target.the("boton de login ").located(By.id("btnLogin"));
}
