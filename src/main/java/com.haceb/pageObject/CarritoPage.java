package com.haceb.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    // Click en el menu de categorias
    private final By ddlCategorias = By.xpath("//a[@class='nav__link' and contains(text(), 'Categorías')]");

    private final By lnkElectrodomesticosCocina = By.xpath("//a[@class='link-parent' and contains(text(), 'Electrodomésticos de cocina')]");

    // Corregir XPATH
    private final By ddlAleatorioElectrodomesticosCocina = By.xpath("//header/div[3]/div[1]/nav[1]/ul[2]/li[4]/ul[1]/div[1]/li[1]/a[1]");


}
