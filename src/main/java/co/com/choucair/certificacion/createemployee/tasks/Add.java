package co.com.choucair.certificacion.createemployee.tasks;

import co.com.choucair.certificacion.createemployee.model.EmployeeData;
import co.com.choucair.certificacion.createemployee.userinterface.AddEmployeeForm;
import co.com.choucair.certificacion.createemployee.userinterface.GoModule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Add implements Task
{
    private List<EmployeeData> Data;


    public Add (List<EmployeeData> data)
        {
            this.Data = data;
        }
    public static Add Employee(List<EmployeeData> Data)
        {
            return Tasks.instrumented(Add.class, Data);
        }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        WaitUntil.the((AddEmployeeForm.FIELD_NAME),isVisible()).forNoMoreThan(3).seconds(),
                        Enter.theValue(Data.get(0).getFieldName()).into(AddEmployeeForm.FIELD_NAME),
                        Enter.theValue(Data.get(0).getLastName()).into(AddEmployeeForm.LAST_NAME),
                        Enter.theValue(Data.get(0).getMiddleName()).into(AddEmployeeForm.MIDDLE_NAME),
                        Enter.theValue(Data.get(0).getIdNumber()).into(AddEmployeeForm.ID_NUMBER),
                        //Click.on(AddEmployeeForm.DISPLAY_LOCATION),
                        //Click.on(AddEmployeeForm.LOCATION),
                        //SelectFromOptions.byVisibleText(Data.get(0).getSupervisorRole()).from(AddEmployeeForm.LOCATION),
                        Click.on(AddEmployeeForm.LOGIN_DETAILS),
                        Enter.theValue(Data.get(0).getUserName()).into(AddEmployeeForm.USER_NAME),
                        Click.on(AddEmployeeForm.STATUS_DISPLAY),
                        Click.on(AddEmployeeForm.STATUS_ENABLED),
                        Click.on(AddEmployeeForm.PASSWORD),
                        //SelectFromOptions.byVisibleText("Enabled").from(AddEmployeeForm.STATUS_ENABLED),
                        /*Check.whether(Data.get(0).getStatus().toString().trim().equals("Enable"))
                                .andIfSo(Click.on(AddEmployeeForm.STATUS_ENABLED))
                                .otherwise(Click.on(AddEmployeeForm.STATUS_DISABLED)),*/
                        Enter.theValue(Data.get(0).getPassword()).into(AddEmployeeForm.PASSWORD),
                        Enter.theValue(Data.get(0).getConfirmPassword()).into(AddEmployeeForm.CONFIRM_PASSWORD),
                        Enter.theValue(Data.get(0).getEssRole()).into(AddEmployeeForm.ESS_ROLE),
                        SelectFromOptions.byVisibleText(Data.get(0).getSupervisorRole()).from(AddEmployeeForm.SUPERVISOR_ROLE),
                        SelectFromOptions.byVisibleText(Data.get(0).getAdminRole()).from(AddEmployeeForm.ADMIN_ROLE),
                        Check.whether(Data.get(0).getAllRegions().toString().trim().equals("si"))
                                     .andIfSo(Click.on(AddEmployeeForm.BUTTON_NEXT))
                                     .otherwise(Click.on(AddEmployeeForm.CHECK_ALL_REGIONS),
                                                        SelectFromOptions.byVisibleText(Data.get(0).getSelectRegion()).from(AddEmployeeForm.SELECT_REGION),
                                                        Click.on((AddEmployeeForm.BUTTON_NEXT)))

                );
    }
}
