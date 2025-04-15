package co.com.banistmo.stepdefinitions;

import co.com.banistmo.questions.ValidarPdfDescargado;
import co.com.banistmo.task.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ReportePdfStepDefinition {

    @Given("el usuario ingresa a la pagina debe ir a Productos y Servicios")
    public void elUsuarioIngresaALaPaginaDebeIrAProductosYServicios() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarProductosServicios.enElMenu()
        );
    }

    @Given("selecciona la opcion de Prestamos")
    public void seleccionaLaOpcionDePrestamos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarPrestamos.delMenuProductosServicios()
        );
    }

    @When("selecciona la opcion de Prestamos de auto")
    public void seleccionaLaOpcionDePrestamosDeAuto() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarPrestamoAuto.dePrestamos()
        );
    }

    @When("selecciona la opcion de Tasas y Tarifas")
    public void seleccionaLaOpcionDeTasasYTarifas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarTasasTarifas.dePrestamoAutos()
        );
    }

    @Then("selecciona el pdf de Prohibiciones")
    public void seleccionaElPdfDeProhibiciones() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarPdfProhibiciones.deTasasTarifas()
        );
    }

    @Then("valida que sea el pdf correcto")
    public void validaQueSeaElPdfCorrecto() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarPdfDescargado.deProhibiciones(), equalTo(true))
        );
    }
}
