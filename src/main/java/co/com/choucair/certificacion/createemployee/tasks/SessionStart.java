package co.com.choucair.certificacion.createemployee.tasks;

import co.com.choucair.certificacion.createemployee.userinterface.OrangeRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class SessionStart implements Task
{

    public static SessionStart onThePage()
        {
            return Tasks.instrumented(SessionStart.class);
        }

    @Override
    public <T extends Actor> void performAs(T actor)
        {
            actor.attemptsTo
                    (
                            Enter.theValue("admin").into(OrangeRegistrationPage.USER_NAME),
                            Enter.theValue("admin123").into(OrangeRegistrationPage.USER_PASSWORD),
                            Click.on(OrangeRegistrationPage.LOGIN_BUTTON)
                    );
        }
}
