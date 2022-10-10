package com.co.swablabs.stepdefinitions;


import com.co.swablabs.tasks.Login;
import com.co.swablabs.userintefaces.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.co.swablabs.utils.Url.URL;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SwagLabsStepDefinition {


    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Anni");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that i enter the web site$")
    public void thatIEnterTheWebSite() {
       theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    @When("^enter the credentials$")
    public void enterTheCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.inThePage());
    }

    @Then("^should see on the screen login successfully$")
    public void shouldSeeOnTheScreenLoginSuccessfully() {

    }


}
