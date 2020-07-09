package co.com.choucair.certification.createemployee.stepdefinitions;

import co.com.choucair.certificacion.createemployee.tasks.Add;
import co.com.choucair.certificacion.createemployee.model.EmployeeData;
import co.com.choucair.certificacion.createemployee.tasks.Go;
import co.com.choucair.certificacion.createemployee.tasks.OpenUp;
import co.com.choucair.certificacion.createemployee.tasks.SessionStart;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class CreateEmployeeStepDefinitions
{
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Juan needs to create an employee at the OrageHR$")
        public void thatJuanNeedsToCreateAnEmployeeAtTheOrageHR()
            {
                OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage(), (SessionStart.onThePage()),(Go.themodule()));
            }

    @When("^he enters the registry in the application$")
        public void heEntersTheRegistryInTheApplication(List<EmployeeData> Data)
            {
                OnStage.theActorInTheSpotlight().attemptsTo(Add.Employee(Data));
            }

    @Then("^he displays the new employee in the application$")
    public void heDisplaysTheNewEmployeeInTheApplication(){

    }
}
