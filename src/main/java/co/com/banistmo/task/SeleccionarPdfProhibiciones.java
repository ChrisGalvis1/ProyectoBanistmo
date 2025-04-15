package co.com.banistmo.task;

import co.com.banistmo.pages.PrestamosAutoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.actions.Click.on;

public class SeleccionarPdfProhibiciones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(PrestamosAutoPage.PDF_PROHIBICIONES)
        );
    }

    public static SeleccionarPdfProhibiciones deTasasTarifas(){
        return new SeleccionarPdfProhibiciones();
    }
}
