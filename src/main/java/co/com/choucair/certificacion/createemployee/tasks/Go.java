package co.com.choucair.certificacion.createemployee.tasks;

import co.com.choucair.certificacion.createemployee.userinterface.AddEmployeeForm;
import co.com.choucair.certificacion.createemployee.userinterface.GoModule;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Go implements Task
{

    public static Go themodule()
    {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Click.on(GoModule.BUTTON_INFO_MODULE),
                        Click.on(GoModule.BUTTON_ADD),
                        WaitUntil.the((AddEmployeeForm.FIELD_NAME),isVisible()).forNoMoreThan(4).seconds()
                );
    }
}
