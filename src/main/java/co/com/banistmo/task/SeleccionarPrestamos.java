package co.com.banistmo.task;

import co.com.banistmo.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.actions.Click.on;

public class SeleccionarPrestamos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(HomePage.PRESTAMOS)
        );
    }

    public static SeleccionarPrestamos delMenuProductosServicios(){
        return new SeleccionarPrestamos();
    }
}
