package co.com.banistmo.task;

import co.com.banistmo.pages.PrestamosAutoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.actions.Click.on;

public class SeleccionarTasasTarifas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(PrestamosAutoPage.TASAS_TARIFAS)
        );
    }

    public static SeleccionarTasasTarifas dePrestamoAutos(){
        return new SeleccionarTasasTarifas();
    }
}
