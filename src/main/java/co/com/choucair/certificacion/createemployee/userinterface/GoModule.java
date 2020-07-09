package co.com.choucair.certificacion.createemployee.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoModule
{
    public static final Target BUTTON_INFO_MODULE = Target.the("boton de informacion de modulo").located(By.id("menu_pim_viewPimModule"));
    public static final Target BUTTON_ADD =Target.the("boton de adicionar empleado ").located(By.id("menu_pim_addEmployee"));
}
