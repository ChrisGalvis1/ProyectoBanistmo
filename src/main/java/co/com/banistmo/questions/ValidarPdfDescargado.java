package co.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ValidarPdfDescargado implements Question <Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        /*WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String ventanaAntes = driver.getWindowHandle();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(drv -> drv.getWindowHandles().size() > ventanaAntes.size());

        Set<String> ventanaDespues = driver.getWindowHandles();
        ventanaDespues.removeAll(ventanaAntes);


        for (String ventana : ventanas){
            if (!ventana.equals(ventanaNueva)){
                driver.switchTo().window(ventana);
                break;
            }
        }
        String urlPdfSeleccionado = driver.getCurrentUrl();
        driver.switchTo().window(ventanaNueva);
        return urlPdfSeleccionado.contains("ProhibicionesSuperIntendenciaDeBancosSIB.pdf");*/
        return null;
    }

    public static ValidarPdfDescargado deProhibiciones(){
        return new ValidarPdfDescargado();
    }
}
