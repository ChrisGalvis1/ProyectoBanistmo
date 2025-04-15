package co.com.banistmo.hook;

import co.com.banistmo.utils.Constantes;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.openqa.selenium.WebDriver;

public class Hook {

    @Managed
    WebDriver navegador;

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("ChristianQA").can(BrowseTheWeb.with(navegador));
        navegador.get(Constantes.BASE_URL_WEB);
    }
}
