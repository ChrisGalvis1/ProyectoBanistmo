package co.com.banistmo.task;

import co.com.banistmo.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;

public class SeleccionarProductosServicios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(HomePage.AVISO_SEGURIDAD),
                on(HomePage.PRODUCTOS_SERVICIOS)
        );
    }

    public static SeleccionarProductosServicios enElMenu(){
        return instrumented(SeleccionarProductosServicios.class);
    }
}
