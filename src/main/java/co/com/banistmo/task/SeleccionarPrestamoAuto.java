package co.com.banistmo.task;

import co.com.banistmo.pages.PrestamosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.actions.Click.on;

public class SeleccionarPrestamoAuto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(PrestamosPage.PRESTAMOS_AUTO),
                on(PrestamosPage.PRESTAMOS_AUTO_REGULAR)
        );
    }

    public static SeleccionarPrestamoAuto dePrestamos(){
        return new SeleccionarPrestamoAuto();
    }
}
