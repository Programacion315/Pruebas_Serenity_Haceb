package com.haceb.steps;

import com.haceb.pageObject.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSteps {

    @Page
    InicioPage inicioPage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        inicioPage.openUrl("https://www.haceb.com/");
    }
}
