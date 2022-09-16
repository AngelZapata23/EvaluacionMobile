package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLoginStepsDefs {
    @Steps
    SwagLabsSteps swagLabsSteps;

    @Given("que me encuentro en la página de login SwagLabs")
    public void queMeEncuentroEnLaPáginaDeLoginSwagLabs() {
        swagLabsSteps.init();
    }

    @When("inicio sesión con el usuario {string} y contraseña {string}")
    public void inicioSesiónConElUsuarioYContraseña(String user, String password) {
            swagLabsSteps.ingresarUser(user);
            swagLabsSteps.ingresarContraseña(password);
            swagLabsSteps.clicLogin();
        }



    @Then("valido debe estar el titutlo {string}")
    public void validoDebeEstarElTitutlo(String expectedTitle) {
        Assert.assertEquals(swagLabsSteps.getResultText(), expectedTitle);
    }

    @And("valido que exitan un item")
    public void validoQueExitanUnItem() {
        swagLabsSteps.itemsize();
    }
}


