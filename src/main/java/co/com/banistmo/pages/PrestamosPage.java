package co.com.banistmo.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrestamosPage {

    private PrestamosPage(){
    }

    public static final Target PRESTAMOS_AUTO = Target.the("Imagen de prestamos de autos")
            .located(By.xpath("(//a[@title='Préstamos de Auto'])[2]"));

    public static final Target PRESTAMOS_AUTO_REGULAR = Target.the("Imagen de prestamos de autos regulares")
            .located(By.xpath("(//a[@title='Cuentas de Ahorro'])[2]"));
}
