package co.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class ValidarPdfDescargado implements Question <Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> ventanaAntes = driver.getWindowHandles();
        Set<String> ventanaDespues = driver.getWindowHandles();
        try {
            Thread.sleep(3000); // Espera de 3 segundos para asegurar que la nueva pestaña se haya cargado
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ventanaDespues.removeAll(ventanaAntes);
        if (!ventanaDespues.isEmpty()){
            String ventanaNueva = ventanaDespues.iterator().next();
            driver.switchTo().window(ventanaNueva);
            String urlPdfGenerado = driver.getCurrentUrl();
            return urlPdfGenerado.contains("ProhibicionesSuperIntendenciaDeBancosSIB.pdf");
        }
        return false;
    }

    public static ValidarPdfDescargado deProhibiciones(){
        return new ValidarPdfDescargado();
    }
}
