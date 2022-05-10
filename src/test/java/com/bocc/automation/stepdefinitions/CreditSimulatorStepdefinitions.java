package com.bocc.automation.stepdefinitions;

import com.bocc.automation.questions.AmountQuestion;
import com.bocc.automation.task.CompleteFormTask;
import com.bocc.automation.task.OpenTheBrowserTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.bocc.automation.ui.BoccDataPage;
import com.bocc.automation.ui.BoccSimulatorPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreditSimulatorStepdefinitions {

    @Managed(driver = "chrome")
    public WebDriver hisBrowser;
    public Actor Daniel = Actor.named("Daniel");

    @Before
    public void setUp(){
        Daniel.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^As a web user I navigate to Banco de Occidente$")
    public void asAWebUserINavigateToBancoDeOccidente() {
        Daniel.wasAbleTo(OpenTheBrowserTask.on());
    }

    @When("^enter request parameters$")
    public void enterRequestParameters() {
        Daniel.wasAbleTo(CompleteFormTask.input());
    }

    @Then("^validate quota value$")
    public void validateQuotaValue() {
        Daniel.should(seeThat(AmountQuestion.value(), equalTo(BoccDataPage.label_Validation)));
        System.out.println("**** Validación del sistema ****");
        System.out.println("Respuesta de Sistema: "+AmountQuestion.value().answeredBy(Daniel)+", Comparación: "+BoccDataPage.label_Validation);
    }
}
